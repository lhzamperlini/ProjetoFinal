package views;

import controllers.ConsultaController;
import models.Consulta;
import views.interfaces.IViews;


public class ListarConsulta implements IViews{
    public void renderizar(){
        ConsultaController consultaController = new ConsultaController();
        System.out.println("--LISTAGEM DE CONSULTAS--");
        for (Consulta consultaCadastrada : consultaController.listar()) 
            System.out.println(consultaCadastrada);
        }

    }

