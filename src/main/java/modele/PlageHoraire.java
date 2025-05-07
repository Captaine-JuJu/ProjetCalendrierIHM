package modele;

import modele.Horaire;

public class PlageHoraire {
    private final static int DUREE_MINIMUM = 30;
    private Horaire horaireDebut;
    private Horaire horaireFin;

    public PlageHoraire(Horaire horaireDebut, Horaire horaireFin) throws ExceptionPlanning {
        this.horaireDebut = horaireDebut;
        this.horaireFin = horaireFin;
        if (horaireFin.toMinutes() - horaireDebut.toMinutes() < DUREE_MINIMUM) {
            throw new ExceptionPlanning(1);
        }
    }

    public int duree() {
        return horaireFin.toMinutes() - horaireDebut.toMinutes();
    }

    public boolean estValide() {
        return horaireFin.toMinutes() - horaireDebut.toMinutes() >= DUREE_MINIMUM;
    }

    public String toString() {
        return horaireDebut.getHeure() + "h" + horaireDebut.getQuartHeure() + " à " + horaireFin.getHeure() + "h" + horaireFin.getQuartHeure() + " pour une duree de " + duree() + "min.";
    }

    public int compareTo(PlageHoraire plageHoraire) {
        if (this.horaireFin.toMinutes() <= plageHoraire.horaireDebut.toMinutes())
            return -1;
        if (plageHoraire.horaireFin.toMinutes() <= this.horaireDebut.toMinutes())
            return 1;
        else
            return 0;
    }
}
