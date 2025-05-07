package controleur;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import modele.PlanningCollection;
import vue.GridPaneFormulaireReservation;
import vue.HBoxRoot;


public class Contoleur implements EventHandler{

    @Override
    public void handle(Event event) {
        PlanningCollection planning = HBoxRoot.getPlanning();
        GridPaneFormulaireReservation reservationPane = HBoxRoot.getReservationPane;

        //la source de event est un ToggleButton du calendrier
        //if (event.getSource() instanceof ToggleButton) {

            //Question 5

        }

        //la source de event est le bouton "Enregistrer" du formulaire de réservatuion
        //if (event.getSource() instanceof Button) {

            //Question 6

        }
    }
}
