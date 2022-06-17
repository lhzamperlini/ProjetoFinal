package models;

public class Paciente extends Pessoa {

    private String Nascimento;
    private String Telefone;

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String nascimento) {
        Nascimento = nascimento;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
                " | CPF: " + getCpf() +
                " | Data de nascimento: " + Nascimento +
                " | Telefone: " + Telefone +
                " | E-mail: " + getEmail();
    }

}
