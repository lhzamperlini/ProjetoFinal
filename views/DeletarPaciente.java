package views;

import controllers.PacienteController;
import models.Paciente;
import utils.Console;
import views.interfaces.IViews;


public class DeletarPaciente implements IViews{
    public void renderizar(){
        int op = 0;
        PacienteController pacienteController = new PacienteController();
            do{
                System.out.println("--MENU DELETAR PACIENTE--\n");
                String cpfPaciente = Console.readString("Informe o CPF do paciente: ");
                Paciente paciente = pacienteController.removerPaciente(cpfPaciente);
                    if(paciente == null){
                        System.out.println("Paciente Removido Com Sucesso");
                    }
                    else{
                        System.out.println("PACIENTE NÃO ENCONTRADO");
                        op = Console.readInt("Tecle 1 para tentar novamente, tecle 0 para sair:");
                    }
            }while(op==1);
    }

    
}
