package controllers;

import java.util.ArrayList;

import controllers.interfaces.ISalasController;
import models.Sala;
import models.Paciente;

public class SalasController implements ISalasController {

    private static ArrayList<Sala> salas = new ArrayList<Sala>();

    public void cadastrar(Sala sala) {
        salas.add(sala);
    }

    public ArrayList<Sala> listar() {
        return salas;
    }

    public Sala buscarPaciente(Paciente paciente, String dataI, String dataT, String causa) {
        for (Sala pacienteCadastrado : salas) {
            if (pacienteCadastrado.getPaciente().equals(paciente) && pacienteCadastrado.getDataI().equals(dataI)
                    && pacienteCadastrado.getDataT().equals(dataT) && pacienteCadastrado.getCausa().equals(causa)) {
                return pacienteCadastrado;
            }
        }
        return null;
    }

}
