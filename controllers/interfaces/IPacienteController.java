package controllers.interfaces;

import java.util.ArrayList;

import models.Paciente;

public interface IPacienteController {
    void cadastrar(Paciente paciente);
    ArrayList<Paciente> listar();
    Paciente buscarPorCpf(String cpf);
    Paciente removerPaciente(String cpf);
    Paciente alterarDados(String cpf, int op, String dado);
}
