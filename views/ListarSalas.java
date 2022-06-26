package views;

import models.Sala;
import controllers.SalasController;

public class ListarSalas {
    public void renderizar(){
        SalasController salaController = new SalasController();
        for (Sala salaCadastrado : salaController.listar()) {
            System.out.println(salaCadastrado);
        }
    } 
    
}
