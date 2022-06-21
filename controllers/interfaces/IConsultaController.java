package controllers.interfaces;

import java.util.ArrayList;

import models.Consulta;
import models.Medico;
import models.Paciente;

public interface IConsultaController {

    void cadastrar(Consulta consulta);
    ArrayList<Consulta> listar();
    Consulta buscarMedico(Medico medico, String data, String hora);
    Consulta buscarPaciente(Paciente paciente, String data, String hora);
    
}