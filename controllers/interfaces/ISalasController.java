package controllers.interfaces;

import java.util.ArrayList;

import models.Paciente;
import models.Sala;

public interface ISalasController {
    void cadastrar(Sala sala);

    Sala buscarPaciente(Paciente paciente, String dataI, String dataT, String causa);

    ArrayList<Sala> listar();

}
