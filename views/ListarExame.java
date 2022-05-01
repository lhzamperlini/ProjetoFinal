package views;

import models.Exame;
import controllers.ExameController;

public class ListarExame {
    public void renderizar(){
        ExameController exameController = new ExameController();
        for (Exame exameCadastrado : exameController.listar()) {
            System.out.println(exameCadastrado);
        }
    }    
}
