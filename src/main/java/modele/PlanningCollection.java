package modele;

import java.util.*;

public class PlanningCollection {
    private ArrayList<Reservation> chArrayList;
    private TreeSet<Reservation> chTreeSet;
    private TreeMap<Integer, TreeSet<Reservation>> chTreeMap;

    public PlanningCollection() {
        chArrayList = new ArrayList <Reservation> ();
        chTreeSet = new TreeSet <Reservation> ();
        chTreeMap = new TreeMap <Integer, TreeSet<Reservation>>();
    }

    public String toString() {
        return chArrayList.size() + " " + chArrayList.toString() + "\n" + chTreeSet.size() + " " + chTreeSet.toString() + "\n" + chTreeMap.size() + " " + chTreeMap.toString();
    }

    /** La méthode ajout ajoute à la liste this (arraylist ou treeset) l'objet de type reservation placé en parametre
     * si elle n'entre pas en conflit avec une reservation déja enregistré sinon une exception est levée
     * param : Reservation */
     public void ajout(Reservation parReservation) throws ExceptionPlanning{
         if (chArrayList.size() == 0){
             chArrayList.add(parReservation);
         }
         else {
             for (int i = 0; i < chArrayList.size(); i++){
                 if (chArrayList.get(i).compareTo(parReservation) == 0){
                     throw new ExceptionPlanning(2);
                 }
             }
             chArrayList.add(parReservation);
         }

//---------------------------------------------------------------------------------

         int tailleTreeSet = chTreeSet.size();

         chTreeSet.add(parReservation);

         if (tailleTreeSet == chTreeSet.size()){
             throw new ExceptionPlanning(0);
         }

//---------------------------------------------------------------------------------

         int numSemaine = parReservation.getDate().getNumSemaine();
         TreeSet<Reservation> setReservation = chTreeMap.get(numSemaine);
         if (setReservation == null){
             setReservation = new TreeSet<>();
             chTreeMap.put(numSemaine, setReservation);
         }
         setReservation.add(parReservation);
     }

    /**La méthode retourne un treeset contenant toutes les réservations du TreeSet de la date mise en paramètre
     * @param parDate
     * @return TreeSet<Reservation>
     */
     public TreeSet<Reservation> getReservationsDate(Date parDate) {
         TreeSet<Reservation> resultat = new TreeSet<>();
         for (Reservation res : chTreeSet){
             if (res.getDate().compareTo(parDate) == 0)
                 resultat.add(res);
         }
         return resultat;
     }

    /**La méthode retourne un treeset contenant toutes les réservation contenant la chaine de caractère en parametre
     * @param parString
     * @return TreeSet<Reservation>
     */
    public TreeSet<Reservation> getReservationsIntitule(String parString) {
        TreeSet<Reservation> resultat = new TreeSet<>();
        for (Reservation res : chTreeSet){
            if (res.getIntitule().equals(parString))
                resultat.add(res);
        }
        return resultat;
    }

}
