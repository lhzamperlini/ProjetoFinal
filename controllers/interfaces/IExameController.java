package controllers.interfaces;

import java.util.ArrayList;

import models.Exame;
import models.Paciente;

public interface IExameController {
    
    void cadastrar(Exame exame);
    ArrayList<Exame> listar();
    Exame buscarPaciente(Paciente paciente, String data, String hora);
    
}
