package modele;

import modele.Date;
import modele.PlageHoraire;

public class Reservation implements Comparable<Reservation> {
    private Date chDate;
    private PlageHoraire chPlageHoraire;
    private String chIntitule;

    public Reservation(String parIntitule, Date parDate, PlageHoraire parPlageHoraire) throws ExceptionPlanning{
        chIntitule = parIntitule;
        chDate = parDate;
        chPlageHoraire = parPlageHoraire;
        if (chIntitule == "" || chDate.estValide() == false) {
            throw new ExceptionPlanning(1);
        }
    }

    public int compareTo(Reservation reservation) {
        if (chDate.compareTo(reservation.chDate) == 1) {
            return 1;
        }
        else if (chDate.compareTo(reservation.chDate) == -1) {
            return -1;
        }
        else if (chDate.compareTo(reservation.chDate) == 0) {
            if (chPlageHoraire.compareTo(reservation.chPlageHoraire) == 1) {
                return 1;
            }
            else if (chPlageHoraire.compareTo(reservation.chPlageHoraire) == -1) {
                return -1;
            };
        }
        return 0;
    }

    public String toString() {
        return chIntitule + ", " + chDate + ", " + chPlageHoraire;
    }

    public boolean estValide() {
        if (!this.chPlageHoraire.estValide()) {
            return false;
        }
        if (!this.chDate.estValide()) {
            return false;
        }
        return true;
    }

    public Date getDate() {
        return chDate;
    }

    public String getIntitule() {
        return chIntitule;
    }
}
