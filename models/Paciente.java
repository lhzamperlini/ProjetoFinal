package models;

public class Paciente {
    
    private String nome;
    private String cpf;
    private String Nascimento;
    private String email;
    private String Telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNascimento() {
        return Nascimento;
    }
    public void setNascimento(String nascimento) {
        Nascimento = nascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
         return "\nNome: " + nome + 
         " | CPF: " + cpf + 
         " | Data de nascimento: " +  Nascimento + 
         " | Telefone: " + Telefone + 
         " | E-mail: " + email;
    }
    
}
