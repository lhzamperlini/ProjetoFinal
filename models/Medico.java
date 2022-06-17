package models;

public class Medico extends Pessoa {

    private String crm;
    private String especializacao;

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

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                " | crm: " + crm +
                " | Especialização: " + especializacao +
                " | Email: " + getEmail();
    }

}