package controllers.interfaces;

import java.util.ArrayList;

import models.Medico;

public interface IMedicoController {
    void cadastrar (Medico medico);
    ArrayList<Medico> listar();
    Medico buscarCRM(String crm);
}
