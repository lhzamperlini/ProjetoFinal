package views;

import controllers.VacinaController;
import utils.Console;
import views.interfaces.IViews;


public class CalendarioVacinação implements IViews{
    public void renderizar() {
        // Declaração de Variaveis
        int op, op2;
        VacinaController vacinaController = new VacinaController();

        // Entrada
        System.out.println("--CALENDARIO DE VACINAÇÃO--");
        System.out.println("\nTECLE 0 SE NÃO TOMOU VACINA.");
        System.out.println("\nTECLE 1 PARA CORONAVAC.");
        System.out.println("TECLE 2 PARA PFIZER.");
        System.out.println("TECLE 3 PARA ASTRAZENECA.");
        System.out.println("TECLE 4 PARA JANSSEN.");
        op = Console.readInt("\nINFORME A OPÇÃO DESEJADA: ");

        if (op == 0) {
            System.out.println("\n--CORRA PARA A UNIDADE DE SAÚE MAIS PROXIMA PARA TOMAR A VACINA--");
        } else {
            System.out.println("--ATÉ QUAL DOSE VOCÊ TOMOU?--");
            System.out.println("\nTECLE 1 PARA PRIMEIRA DOSE");
            System.out.println("TECLE 2 PARA SEGUNDA DOSE.");
            System.out.println("TECLE 3 PARA TERCEIRA DOSE.");
            System.out.println("TECLE 4 PARA QUARTA DOSE.");
            op2 = Console.readInt("\nINFORME A DOSE: ");

            String calendario = vacinaController.calendario(op, op2);
            System.out.println(calendario);
        }
    }
}
