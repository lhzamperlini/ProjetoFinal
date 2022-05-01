package views;

import controllers.MedicoController;
import models.Medico;
import utils.Console;

public class CadastrarMedico {

    public void renderizar(){
        Medico medico = new Medico();
        MedicoController medicos = new MedicoController();
        System.out.println("\n \n Cadastro de Médicos :) \n \n");
        medico.setNome(Console.readString("Digite o nome do(a) médico(a):"));
        medico.setcrm(Console.readString("Digite a CRM do(a) médico(a):"));
        medico.setespecializacao(Console.readString("Qual é a especialização do(a) médico(a):"));
        medico.setEmail(Console.readString("Email do(a) médico(a) para contato:"));
        medicos.cadastrar(medico);
        System.out.println("\n\n Mais um salvador de vidas !!! :D");

    }
}