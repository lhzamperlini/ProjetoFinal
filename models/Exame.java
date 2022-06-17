package models;

public class Exame extends AtoMedico {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " | PACIENTE: " + getPaciente() +
                " | NOME DO EXAME: " + nome +
                " | DATA: " + getData() +
                " | HORA: " + getHora();
    }
}
