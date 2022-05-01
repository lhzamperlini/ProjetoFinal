package models;

import models.Medico;
import models.Paciente;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String hora;
    
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return 
            "MEDICO: " + medico.getNome() + 
            " | CRM: " + medico.getcrm() +
            " | PACIENTE: " + paciente.getNome() +
            " | CPF: " + paciente.getCpf() +
            " | DATA: " + data + 
            " | HORA: " + hora;
    }
}
