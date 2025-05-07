package  modele;
import java.util.Arrays;
import modele.Reservation;

public class Planning {
    private Reservation [] chReservation;
    private int TAILLE_TAB;

    public Planning(int parLongeurTableau) {
        TAILLE_TAB = parLongeurTableau;
        chReservation = new Reservation[TAILLE_TAB];
    }

    public void ajout(Reservation reservation) throws ExceptionPlanning {
        if (chReservation[TAILLE_TAB -1] != null) {
            throw new ExceptionPlanning(0);
        }
        //if (!reservation.estValide()) {
        //    throw new ExceptionPlanning(1);
        //}
        for (int i = 0; i < TAILLE_TAB; i++) {
            if (chReservation[i] != null && chReservation[i].compareTo(reservation) == 0) {
                throw new ExceptionPlanning(2);
            }
            if (this.chReservation[i] == null) {
                chReservation[i] = reservation;
                break;
            }
        }
    }
    public String toString() {
        /*String res = new String();
        for (int i = 0; i < TAILLE_TAB - 1; i++) {
             if (chReservation[i] != null) {
                 return res;
             }
               res += chReservation[i].toString();
            }
          return res;*/
        return Arrays.toString(chReservation);
    }
}
