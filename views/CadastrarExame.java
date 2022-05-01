package views;

import controllers.ExameController;
import controllers.PacienteController;
import models.Exame;
import models.Paciente;
import utils.Console;

public class CadastrarExame {

    public void renderizar() {
        Exame exame = new Exame();
        ExameController exames = new ExameController();
        PacienteController PacienteController = new PacienteController();
        
    // Variavel Condicional
        int opP = 1;
    //Condicional Paciente
        System.out.println("\n--MENU CADASTRO DE EXAMES--");
        String cpfPaciente = Console.readString("Informe o CPF do Paciente: ");
        Paciente paciente = PacienteController.buscarPorCpf(cpfPaciente);
        do{
            if(paciente != null){
                exame.setPaciente(paciente);
                exame.setNome(Console.readString("Informe o Nome do Exame: "));
                exame.setData(Console.readString("Informe a data do Exame: "));
                exame.setHora(Console.readString("Informe a Hora do Exame: "));
                exames.cadastrar(exame);
            }
            else{
                System.out.println("\nPACIENTE NÃO ENCONTRADO");
                opP = Console.readInt("Tecle 1 para tentar novamente Ou qualquer tecla para sair: ");
            }
        }while(opP == 1);
    }
}
