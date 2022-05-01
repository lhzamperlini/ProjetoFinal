package models;

public class Exame {
    
    private Paciente paciente;
    private String nome;
    private String data;
    private String hora;

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
            " | PACIENTE: " + paciente.getNome() +
            " | CPF: " + paciente.getCpf() +
            " | NOME DO EXAME: " + nome +
            " | DATA: " + data + 
            " | HORA: " + hora;
    }
}
