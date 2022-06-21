package views;

import controllers.ConsultaController;
import controllers.MedicoController;
import controllers.PacienteController;
import models.Consulta;
import models.Medico;
import models.Paciente;
import utils.Console;
import views.interfaces.IViews;

public class CadastrarConsulta implements IViews{
    public void renderizar() {
        Consulta consulta = new Consulta();
        PacienteController PacienteController = new PacienteController();
        MedicoController MedicoController = new MedicoController();
        ConsultaController consultas = new ConsultaController();

        System.out.println("\n -- CADASTRO DE CONSULTAS -- \n");

        // Paciente
        String cpfPaciente = Console.readString("Digite o CPF do cliente: ");
        Paciente paciente = PacienteController.buscarPorCpf(cpfPaciente);
        if (paciente!=null) {
        consulta.setPaciente(paciente);

         //Medico
           String crmMedico = Console.readString("Digite o CRM do Medico por favor: ");
           Medico medico = MedicoController.buscarCRM(crmMedico);
           if (medico != null){
           consulta.setMedico(medico);

           // Cadastro de Hora e data
           consulta.setData(Console.readString("Informe a Data da Consulta: "));
           consulta.setHora(Console.readString("Informe o Horario da Consulta: "));   

                 // Validar Disponibilidade do Medico
                 Consulta buscarMedico = consultas.buscarMedico(medico, consulta.getData(), consulta.getHora());
                 if(buscarMedico == null){

                     // Validar Disponibilidade do Paciente
                         Consulta buscarPaciente = consultas.buscarPaciente(paciente, consulta.getData(), consulta.getHora());
                         if(buscarPaciente == null){
                            consultas.cadastrar(consulta);
                            System.out.println("\n--CONSULTA AGENDADA--");
                        }
                        else{
                            System.out.println("\nPACIENTE JÁ POSSUI CONSULTA NESTE DIA E HORARIO.");
                        }
                }
                else{
                    System.out.println("\nMEDICO JÁ POSSUI CONSULTA NESTE DIA E HORARIO.");
                }
            }
            else{
                 System.out.println("\nMEDICO NÃO ENCONTRADO.");
            }
        }
        else{
            System.out.println("\nPaciente Não Encontrado");
        }
}
}