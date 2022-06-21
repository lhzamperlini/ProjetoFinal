package views;

import views.interfaces.IViews;
import models.Exame;
import controllers.ExameController;

public class ListarExame implements IViews{
    public void renderizar(){
        ExameController exameController = new ExameController();
        for (Exame exameCadastrado : exameController.listar()) {
            System.out.println(exameCadastrado);
        }
    }    
}
