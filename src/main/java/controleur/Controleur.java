package controleur;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import modele.PlanningCollection;
import org.controlsfx.control.spreadsheet.Grid;
import vue.GridPaneFormulaireReservation;
import vue.HBoxRoot;

public class Controleur implements EventHandler {

    @Override
    public void handle(Event event){
         PlanningCollection planning = HBoxRoot.getPlanning();
         GridPaneFormulaireReservation gridPane = HBoxRoot.getReservationPane();
    }
}
