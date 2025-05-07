package modele;

import modele.ConstantesErreurs;

class ExceptionPlanning extends Exception implements ConstantesErreurs{
    private int chCodeErreur;

    public ExceptionPlanning(int parCodeErreur) {
        chCodeErreur = parCodeErreur;
    }

    public String getCodeErreur() {
        return ERREURS_PLANNING[chCodeErreur];
    }
}
