package views;
import controllers.PacienteController;
import models.Paciente;
import views.interfaces.IViews;

public class ListarPaciente implements IViews{
    public void renderizar(){
        PacienteController pacienteController = new PacienteController();
        for (Paciente pacienteCadastrado : pacienteController.listar()) {
            System.out.println(pacienteCadastrado);
            
        }
    }
}
