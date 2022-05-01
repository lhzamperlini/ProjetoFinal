package controllers;

import java.util.ArrayList;

import models.Exame;
import models.Paciente;

public class ExameController {
    
    private static ArrayList<Exame> exames = new ArrayList<Exame>();

    public void cadastrar(Exame exame){
        exames.add(exame);
    }
    public ArrayList<Exame> listar(){
        return exames;
    }

    public Exame buscarPaciente(Paciente paciente, String data, String hora){
        for (Exame pacienteCadastrado : exames) {
            if (pacienteCadastrado.getPaciente().equals(paciente) && pacienteCadastrado.getData().equals(data) && pacienteCadastrado.getHora().equals(hora)){
                return pacienteCadastrado;
            }
        }
        return null;
    }
}
