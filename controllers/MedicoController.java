package controllers;
import java.util.ArrayList;

import models.Medico;

public class MedicoController {
    private static ArrayList<Medico> medicos = new ArrayList<Medico>();

    public void cadastrar (Medico medico) {
        medicos.add(medico);
    }

    public ArrayList<Medico> listar(){
        return medicos;
    }


    public Medico buscarCRM(String crm){
        for (Medico medicoCrm : medicos) {
            if (medicoCrm.getcrm().equals(crm)){
                return medicoCrm;
            }
        }
        return null;
    }
}
