package models;

public class AtoMedico {
    private models.Paciente Paciente;
    private String Data;
    private String Hora;

    public models.Paciente getPaciente() {
        return Paciente;
    }

    public void setPaciente(models.Paciente paciente2) {
        Paciente = paciente2;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    @Override
    public String toString() {
        return "AtoMedico [Data=" + Data + ", Hora=" + Hora + ", Paciente=" + Paciente + "]";
    }

}
