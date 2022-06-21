package controllers;

import java.util.ArrayList;

import controllers.interfaces.IConsultaController;
import models.Consulta;
import models.Medico;
import models.Paciente;

public class ConsultaController implements IConsultaController {
    
    private static ArrayList<Consulta> consultas = new ArrayList<Consulta>();

    @Override
    public void cadastrar(Consulta consulta) {
        consultas.add(consulta);
    }
 
    @Override
    public ArrayList<Consulta> listar(){
        return consultas;
    }

    @Override
    public Consulta buscarMedico(Medico medico, String data, String hora){
        for (Consulta medicoCadastrado : consultas) {
            if (medicoCadastrado.getMedico().equals(medico) && medicoCadastrado.getData().equals(data) && medicoCadastrado.getHora().equals(hora)){
                return medicoCadastrado;
            }
        }
        return null;
    }

    @Override
    public Consulta buscarPaciente(Paciente paciente, String data, String hora){
        for (Consulta pacienteCadastrado : consultas) {
            if (pacienteCadastrado.getPaciente().equals(paciente) && pacienteCadastrado.getData().equals(data) && pacienteCadastrado.getHora().equals(hora)){
                return pacienteCadastrado;
            }
        }
        return null;
    }
}
