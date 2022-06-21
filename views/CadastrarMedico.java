package views;

import controllers.MedicoController;
import models.Medico;
import utils.Console;
import views.interfaces.IViews;

public class CadastrarMedico implements IViews{

    public void renderizar(){
        int op = 0;
        Medico medico = new Medico();
        MedicoController medicos = new MedicoController();
        System.out.println("\n \n Cadastro de Médicos :) \n \n");
        medico.setNome(Console.readString("Digite o nome do(a) médico(a):"));
        do{
            medico.setcrm(Console.readString("Digite a CRM do(a) médico(a):"));
            // Validando O CRM do Médico
                Medico validar = medicos.buscarCRM(medico.getcrm());
                if(validar == null){
                    medico.setespecializacao(Console.readString("Qual é a especialização do(a) médico(a):"));
                    medico.setEmail(Console.readString("Email do(a) médico(a) para contato:"));
                    medicos.cadastrar(medico);
                    System.out.println("\n\n Mais um salvador de vidas !!! :D");     
                    op = 0;   
                }
                else{
                    System.out.println("\n--OUTRO MEDICO JÁ ESTÁ CADASTRADO COM ESSE CRM--");
                    System.out.println("TECLE 1 PARA TENTAR NOVAMENTE.");
                    System.out.println("\nTECLE 0 PARA VOLTAR AO MENU PRINCIPAL...");
                    op = Console.readInt("INFORME A OPÇÃO DESEJADA: ");
                }
        }while(op == 1);
 
       
    }
}