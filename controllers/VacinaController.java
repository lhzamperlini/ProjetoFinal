package controllers;

import controllers.interfaces.IVacinaController;

public class VacinaController implements IVacinaController {
    private String resultado;

    @Override
    public String calendario(int op, int op2) {

        if (op == 1) {
            switch (op2) {
                case 1:
                    this.resultado = "Sua proxima dose é 1 mês após a data em que tomou a atual.";
                    return resultado;
                case 2:
                    this.resultado = "Sua proxima dose é 4 meses após a data em que tomou a atual.";
                    return resultado;

                case 3:
                    this.resultado = "Sua proxima dose é 4 mês após a data em que tomou a atual.(Apenas se você tiver mais de 50 anos";
                    return resultado;
                case 4:
                    this.resultado = "Ainda não é nescessária a 5 dose.";
                    return resultado;

                default:
                    break;
            }
        } else if (op == 2) {
            switch (op2) {
                case 1:
                    this.resultado = "Sua proxima dose é 2 mêses após a data em que tomou a atual.";
                    return resultado;
                case 2:
                    this.resultado = "Sua proxima dose é 4 meses após a data em que tomou a atual.";
                    return resultado;

                case 3:
                    this.resultado = "Sua proxima dose é 4 mês após a data em que tomou a atual.(Apenas se você tiver mais de 50 anos";
                    return resultado;
                case 4:
                    this.resultado = "Ainda não é nescessária a 5 dose.";
                    return resultado;

                default:
                    break;
            }
        } else if (op == 3) {
            switch (op2) {
                case 1:
                    this.resultado = "Sua proxima dose é 3 mêses após a data em que tomou a atual.";
                    return resultado;
                case 2:
                    this.resultado = "Sua proxima dose é 4 meses após a data em que tomou a atual.";
                    return resultado;

                case 3:
                    this.resultado = "Sua proxima dose é 4 mês após a data em que tomou a atual.(Apenas se você tiver mais de 50 anos";
                    return resultado;
                case 4:
                    this.resultado = "Ainda não é nescessária a 5 dose.";
                    return resultado;

                default:
                    break;
            }
        } else if (op == 4) {
            switch (op2) {
                case 1:
                    this.resultado = "Não tem 2°Dose.";
                    return resultado;
                case 2:
                    this.resultado = "Dose de reforço após 2 meses";
                    return resultado;

                case 3:
                    this.resultado = "Não tem 4 dose.";
                    return resultado;
                case 4:
                    this.resultado = "Ainda não é nescessária a 5 dose.";
                    return resultado;

                default:
                    break;
            }
        }
        return resultado;

    }
}
