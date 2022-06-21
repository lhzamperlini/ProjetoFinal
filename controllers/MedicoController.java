package controllers;
import java.util.ArrayList;

import controllers.interfaces.IMedicoController;
import models.Medico;

public class MedicoController implements IMedicoController {
    private static ArrayList<Medico> medicos = new ArrayList<Medico>();

    @Override
    public void cadastrar (Medico medico) {
        medicos.add(medico);
    }

    @Override
    public ArrayList<Medico> listar(){
        return medicos;
    }

    @Override
    public Medico buscarCRM(String crm){
        for (Medico medicoCrm : medicos) {
            if (medicoCrm.getcrm().equals(crm)){
                return medicoCrm;
            }
        }
        return null;
    }
}
