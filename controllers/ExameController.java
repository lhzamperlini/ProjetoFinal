package controllers;

import java.util.ArrayList;

import models.Exame;

public class ExameController {
    
    private static ArrayList<Exame> exames = new ArrayList<Exame>();

    public void cadastrar(Exame exame){
        exames.add(exame);
    }
    public ArrayList<Exame> listar(){
        return exames;
    }
}
