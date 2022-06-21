package controllers;

import java.util.ArrayList;

import controllers.interfaces.IPacienteController;
import models.Paciente;

public class PacienteController implements IPacienteController {
    
    private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    int cont = -1;

    @Override
    public void cadastrar(Paciente paciente) {
        pacientes.add(paciente);
    }

    @Override
    public ArrayList<Paciente> listar() {
        return pacientes;
    }

    @Override
    public Paciente buscarPorCpf(String cpf){
        for (Paciente pacienteCadastrado : pacientes) {
            if (pacienteCadastrado.getCpf().equals(cpf)) {
                return pacienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public Paciente removerPaciente(String cpf){
        for (Paciente pacienteCadastrado : pacientes) {
            cont = cont+1;
            if (pacienteCadastrado.getCpf().equals(cpf)) {
                /*for (int i = cont; i < pacientes.size(); i++) {
                    this.pacientes[i] = pacientes[i-1];
                    Aqui é um teste para que não fique lixo de memoria mas a priori não deu certo
                }*/
                pacientes.remove(cont);
                return null;
            }
       }
        cont = -1;
        return pacientes.get(cont);
    }

    @Override
    public Paciente alterarDados(String cpf, int op, String dado){
        for (Paciente pacienteCadastrado : pacientes) {
            cont = cont+1;
            if (pacienteCadastrado.getCpf().equals(cpf)){
                switch(op){
                    case 1: pacientes.get(cont).setNome(dado);
                            break;
                    case 2: pacientes.get(cont).setCpf(dado);
                            break;
                    case 3: pacientes.get(cont).setNascimento(dado);
                            break;
                    case 4: pacientes.get(cont).setEmail(dado);
                            break;
                    case 5: pacientes.get(cont).setTelefone(dado);
                }
                return pacientes.get(cont);
            }
        }
        return null;
    }
}
