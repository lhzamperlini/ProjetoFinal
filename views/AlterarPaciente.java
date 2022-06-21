package views;

import utils.Console;
import views.interfaces.IViews;
import controllers.PacienteController;
import models.Paciente;

public class AlterarPaciente implements IViews{
    public void renderizar(){
        PacienteController pacienteController = new PacienteController();
        String dado = "";
        int op;
        int opE = 0;

    do{
        System.out.println("\n--MENU ALTERAÇÃO DE DADOS--\n");
        String cpfPaciente = Console.readString("Informe o CPF do Paciente: ");
        do{
            System.out.println("\nTecle 1 Para Alterar o Nome\n");
            System.out.println("Tecle 2 Para Alterar o CPF");
            System.out.println("Tecle 3 Para Alterar o Data de Nascimento");
            System.out.println("Tecle 4 Para Alterar o E-mail");
            System.out.println("Tecle 5 Para Alterar o Telefone");
            op = Console.readInt("\nInforme a Opção Desejada: ");
    
            switch(op){
                case 1: dado = Console.readString("Informe o novo Nome:");
                        break;
                case 2: dado = Console.readString("Informe o novo CPF:");
                break;
                case 3: dado = Console.readString("Informe a nova Data De Nascimento:");
                break;
                case 4: dado = Console.readString("Informe o novo E-mail:");
                break;
                case 5: dado = Console.readString("Informe o novo Telefone:");
                break;
                default: System.out.println("COMANDO INVALIDO TENTE NOVAMENTE");
            }
        }while(op<1 || op>5);
        Paciente paciente = pacienteController.alterarDados(cpfPaciente, op, dado);
        if (paciente != null){
            System.out.println("\n--ALTERAÇÃO FEITA COM SUCESSO--\n");
            System.out.println(paciente);
        }
        else{
            System.out.println("\nPaciente Não Encontrado\n");
            opE = Console.readInt("\nTecle 1 para tentar novamente Ou qualquer tecla para sair: ");
        }
    }while(opE == 1);
    }
}
