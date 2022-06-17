package models;

public class Consulta extends AtoMedico {
    private Medico medico;

    @Override
    public String toString() {
        return "MEDICO: " + medico.getNome() +
                " | CRM: " + medico.getcrm() +
                " | PACIENTE: " + getPaciente() +
                " | DATA: " + getData() +
                " | HORA: " + getHora();
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
