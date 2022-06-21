package views;

import controllers.ExameController;
import controllers.PacienteController;
import models.Exame;
import models.Paciente;
import utils.Console;
import views.interfaces.IViews;


public class CadastrarExame implements IViews{

    public void renderizar() {
        Exame exame = new Exame();
        ExameController exames = new ExameController();
        PacienteController PacienteController = new PacienteController();

        // Condicional Paciente
        System.out.println("\n--MENU CADASTRO DE EXAMES--");
        String cpfPaciente = Console.readString("Informe o CPF do Paciente: ");
        // VALIDAR CADASTRO PACIENTE
        Paciente paciente = PacienteController.buscarPorCpf(cpfPaciente);
        if (paciente != null) {
            exame.setPaciente(paciente);
            ;
            exame.setNome(Console.readString("Informe o Nome do Exame: "));
            exame.setData(Console.readString("Informe a data do Exame: "));
            exame.setHora(Console.readString("Informe a Hora do Exame: "));
            // Validar Disponibilidade do Paciente
            Exame buscarPaciente = exames.buscarPaciente(paciente, exame.getData(), exame.getHora());
            if (buscarPaciente == null) {
                exames.cadastrar(exame);
                System.out.println("\n--EXAME AGENDADO--");
            } else {
                System.out.println("\nPACIENTE JÁ POSSUI EXAME NESTE DIA E HORARIO.");
            }
        } else {
            System.out.println("\nPACIENTE NÃO ENCONTRADO");
        }
    }
}
