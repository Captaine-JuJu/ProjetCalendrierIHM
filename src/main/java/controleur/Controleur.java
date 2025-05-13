package controleur;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ToggleButton;
import modele.DateCalendrier;
import modele.PlanningCollection;
import org.controlsfx.control.spreadsheet.Grid;
import vue.GridPaneFormulaireReservation;
import vue.HBoxRoot;
import vue.VBoxCalendrier;

public class Controleur implements EventHandler {

    @Override
    public void handle(Event event){
         PlanningCollection planning = HBoxRoot.getPlanning();
         GridPaneFormulaireReservation reservationPane = HBoxRoot.getReservationPane();

        if (event.getSource() instanceof ToggleButton) {

            ToggleButton boutonDate = (ToggleButton) event.getSource();
            DateCalendrier date = (DateCalendrier) boutonDate.getUserData();
            reservationPane.setDate(date);
        }
    }
}
