package views;

import controllers.SalasController;
import controllers.PacienteController;
import models.Paciente;
import models.Sala;
import utils.Console;
import views.interfaces.IViews;

public class SalasUti implements IViews {
    public void renderizar() {
        Sala sala = new Sala();
        PacienteController PacienteController = new PacienteController();
        SalasController consultas = new SalasController();

        System.out.println("\n -- CADASTRO DE SALAS DE UTI -- \n");

        String cpfPaciente = Console.readString("Digite o CPF do cliente: ");
        Paciente paciente = PacienteController.buscarPorCpf(cpfPaciente);
        if (paciente != null) {
            sala.setPaciente(paciente);

            // Cadastro de data de inicio e data de termino do uso da sala
            sala.setDataI(Console.readString("Informe a Data de Inicio: "));
            sala.setDataT(Console.readString("Informe a Data de Término: "));
            sala.setCausa(Console.readString("Informe a Causa Do Paciente estar na Sala: "));

            // Validar Disponibilidade do Paciente
            Sala buscarPaciente = consultas.buscarPaciente(paciente, sala.getDataI(), sala.getDataT(), sala.getCausa());
            if (buscarPaciente == null) {
                consultas.cadastrar(sala);
                System.out.println("\n--SALA AGENDADA AO PACIENTE--");
            } else {
                System.out.println("\nPACIENTE JÁ POSSUI UMA SALA NESTE DIA E HORARIO.");
            }
        } else {
            System.out.println("\nPaciente Não Encontrado");
        }
    }
}
