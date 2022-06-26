package models;

public class Sala {

    private Paciente paciente;
    private String dataI;
    private String dataT;
    private String causa;


    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getDataI() {
        return dataI;
    }
    public void setDataI(String dataI) {
        this.dataI = dataI;
    }
    public String getDataT() {
        return dataT;
    }
    public void setDataT(String dataT) {
        this.dataT = dataT;
    }
    public String getCausa() {
        return causa;
    }
    public void setCausa(String causa) {
        this.causa = causa;
    }

    @Override
    public String toString() {
        return 
            " | PACIENTE: " + paciente.getNome() +
            " | CPF: " + paciente.getCpf() +
            " | DATA DE INICIO: " + dataT + 
            " | DATA DE TÉRMINO: " + dataI +
            " | CASO DO PACIENTE: " + causa;
    }

}
