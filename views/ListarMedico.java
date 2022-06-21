package views;


import controllers.MedicoController;
import models.Medico;
import views.interfaces.IViews;

public class ListarMedico implements IViews{

    public void renderizar(){
        MedicoController medicoController = new MedicoController();
        System.out.println("\n\n Listagem de Médicos: \n\n");
        for (Medico medicoCadastrado : medicoController.listar()) {
            System.out.println(medicoCadastrado);
        }
    }
    
}
