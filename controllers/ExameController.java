package controllers;

import java.util.ArrayList;

import controllers.interfaces.IExameController;
import models.Exame;
import models.Paciente;

public class ExameController implements IExameController{
    
    private static ArrayList<Exame> exames = new ArrayList<Exame>();

    @Override
    public void cadastrar(Exame exame){
        exames.add(exame);
    }

    @Override
    public ArrayList<Exame> listar(){
        return exames;
    }

    @Override
    public Exame buscarPaciente(Paciente paciente, String data, String hora){
        for (Exame pacienteCadastrado : exames) {
            if (pacienteCadastrado.getPaciente().equals(paciente) && pacienteCadastrado.getData().equals(data) && pacienteCadastrado.getHora().equals(hora)){
                return pacienteCadastrado;
            }
        }
        return null;
    }
}
