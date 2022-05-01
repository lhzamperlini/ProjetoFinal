package models;

public class Medico {
    
    private String nome;
    private String crm;
    private String especializacao;
    private String email;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getcrm() {
        return crm;
    }
    public void setcrm(String crm) {
        this.crm = crm;
    }


    public String getespecializacao() {
        return especializacao;
    }
    public void setespecializacao(String especializacao) {
        this.especializacao = especializacao;

    }
    
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return 
            "Nome: " + nome + 
            " | crm: " + crm +
            " | Especialização: " + especializacao +
            " | Email: " + email;
    }
    
}