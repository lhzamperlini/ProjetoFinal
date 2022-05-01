package views;
import controllers.PacienteController;
import models.Paciente;

public class ListarPaciente {
    public void renderizar(){
        PacienteController pacienteController = new PacienteController();
        for (Paciente pacienteCadastrado : pacienteController.listar()) {
            System.out.println(pacienteCadastrado);
            
        }
    }
}
