package views;

import models.Paciente;
import utils.Console;
import controllers.PacienteController;
import views.interfaces.IViews;


public class CadastrarPaciente implements IViews{
    public void renderizar(){
        Paciente paciente = new Paciente();
        PacienteController pacientes = new PacienteController();
        int op = 0;
//Entrada do Usuario
        System.out.println("--CADASTRO DE PACIENTES--");
        paciente.setNome(Console.readString("Insira o Nome do Paciente: "));
        do{
            paciente.setCpf(Console.readString("Informe o CPF do paciente: "));
                // Validando CPF Paciente
                Paciente validar = pacientes.buscarPorCpf(paciente.getCpf());
                if (validar == null) {
                    //Cadastro de outros dados
                        paciente.setNascimento(Console.readString("Informe a data de Nascimento: "));
                        paciente.setTelefone(Console.readString("Informe o Telefone do Paciente: "));
                        paciente.setEmail(Console.readString("Informe o E-mail do Pacinente: "));
                    // Cadastro no Controller
                        pacientes.cadastrar(paciente); 
                        System.out.println("--PACIENTE CADASTRADO--");
                        op = 0;
                } 
                else {
                    System.out.println("\n--OUTRO PACIENTE JÁ ESTÁ CADASTRADO COM ESSE CPF--\n");
                    System.out.println("TECLE 1 PARA TENTAR NOVAMENTE.");
                    System.out.println("TECLE 0 PARA VOLTAR AO MENU PRINCIPAL...\n");
                    op = Console.readInt("INFORME A OPÇÃO DESEJADA: ");
         }

        }while(op == 1);

 }   
}
