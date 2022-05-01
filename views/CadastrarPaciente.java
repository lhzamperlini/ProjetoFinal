package views;

import models.Paciente;
import utils.Console;
import controllers.PacienteController;

public class CadastrarPaciente {
    public void renderizar(){
        Paciente paciente = new Paciente();
        PacienteController pacientes = new PacienteController();
//Entrada do Usuario
        System.out.println("--CADASTRO DE PACIENTES--");
        paciente.setNome(Console.readString("Insira o Nome do Paciente: "));
        paciente.setCpf(Console.readString("Informe o CPF do paciente: "));
        paciente.setNascimento(Console.readString("Informe a data de Nascimento: "));
        paciente.setTelefone(Console.readString("Informe o Telefone do Paciente: "));
        paciente.setEmail(Console.readString("Informe o E-mail do Pacinente: "));
// Cadastro no Controller
        pacientes.cadastrar(paciente);
    }   
}
