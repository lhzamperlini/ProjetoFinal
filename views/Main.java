package views;

import utils.Console;

public class Main {
        public static void main(String args[]) {
                int op = 0;

                do {
                        // ENTRADA DE DADOS
                        System.out.println("\n--SISTEMA CLINICAS--\n");
                        System.out.println("Tecle 1 Para Cadastrar Um Paciente: ");
                        System.out.println("Tecle 2 Para Listar Os Pacientes Cadastrados: ");
                        System.out.println("Tecle 3 Para Alterar o Dado De Um Paciente: ");
                        System.out.println("Tecle 4 Para Remover Um Paciente: ");
                        System.out.println("Tecle 5 Para Cadastrar Um Medico: ");
                        System.out.println("Tecle 6 Para Listar Os Medicos Cadastrados: ");
                        System.out.println("Tecle 7 Para Cadastrar Uma Consulta: ");
                        System.out.println("Tecle 8 Para Listar As Consultas Cadastradas: ");
                        System.out.println("Tecle 9 Para Cadastrar Um Exame: ");
                        System.out.println("Tecle 10 Para Listar Os Exames Cadastrados: ");
                        System.out.println("Tecle 11 Para Obter o Calendario De Vacinação Contra COVID");
                        System.out.println("Tecle 12 Para Alugar Salas(UTI)");
                        System.out.println("Tecle 13 Para  Listar as Salas Alugadas(UTI)");
                        System.out.println("Tecle 0 Para Sair");
                        op = Console.readInt("\nDigite A Opção Desejada: ");

                        // PROCESSAMENTO && SAIDA DE DADOS
                        switch (op) {
                                case 1:
                                        CadastrarPaciente cadastrarPaciente = new CadastrarPaciente();
                                        cadastrarPaciente.renderizar();
                                        break;

                                case 2:
                                        ListarPaciente listarPaciente = new ListarPaciente();
                                        listarPaciente.renderizar();
                                        break;

                                case 3:
                                        AlterarPaciente alterarPaciente = new AlterarPaciente();
                                        alterarPaciente.renderizar();
                                        break;

                                case 4:
                                        DeletarPaciente deletarPaciente = new DeletarPaciente();
                                        deletarPaciente.renderizar();
                                        break;

                                case 5:
                                        CadastrarMedico cadastrarMedico = new CadastrarMedico();
                                        cadastrarMedico.renderizar();
                                        break;

                                case 6:
                                        ListarMedico listarMedico = new ListarMedico();
                                        listarMedico.renderizar();
                                        break;

                                case 7:
                                        CadastrarConsulta cadastrarConsulta = new CadastrarConsulta();
                                        cadastrarConsulta.renderizar();
                                        break;

                                case 8:
                                        ListarConsulta listarConsulta = new ListarConsulta();
                                        listarConsulta.renderizar();
                                        break;

                                case 9:
                                        CadastrarExame cadastrarExame = new CadastrarExame();
                                        cadastrarExame.renderizar();
                                        break;

                                case 10:
                                        ListarExame listarExame = new ListarExame();
                                        listarExame.renderizar();
                                        break;
                                case 11:
                                        CalendarioVacinação calendarioVacinação = new CalendarioVacinação();
                                        calendarioVacinação.renderizar();
                                        break;
                                case 12:
                                        SalasUti salasUti = new SalasUti();
                                        salasUti.renderizar();
                                        break;
                        
                                case 13:
                                        ListarSalas listarsala = new ListarSalas();
                                        listarsala.renderizar();
                                        break;
                        }

                } while (op != 0);
                System.out.println("ATÉ A PROXIMA!!");
        }

}
