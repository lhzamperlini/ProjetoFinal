package controllers;

import java.util.ArrayList;
import models.Consulta;
import models.Medico;
import models.Paciente;

public class ConsultaController {
    
    private static ArrayList<Consulta> consultas = new ArrayList<Consulta>();

    public void cadastrar(Consulta consulta) {
        consultas.add(consulta);
    }

    public ArrayList<Consulta> listar(){
        return consultas;
    }

    public Consulta buscarMedico(Medico medico, String data, String hora){
        for (Consulta medicoCadastrado : consultas) {
            if (medicoCadastrado.getMedico().equals(medico) && medicoCadastrado.getData().equals(data) && medicoCadastrado.getHora().equals(hora)){
                return medicoCadastrado;
            }
        }
        return null;
    }

    public Consulta buscarPaciente(Paciente paciente, String data, String hora){
        for (Consulta pacienteCadastrado : consultas) {
            if (pacienteCadastrado.getPaciente().equals(paciente) && pacienteCadastrado.getData().equals(data) && pacienteCadastrado.getHora().equals(hora)){
                return pacienteCadastrado;
            }
        }
        return null;
    }
}
