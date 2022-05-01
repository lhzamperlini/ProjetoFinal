package views;

import controllers.ConsultaController;
import models.Consulta;

public class ListarConsulta {
    public void renderizar(){
        ConsultaController consultaController = new ConsultaController();
        System.out.println("--LISTAGEM DE CONSULTAS--");
        for (Consulta consultaCadastrada : consultaController.listar()) 
            System.out.println(consultaCadastrada);
        }

    }

