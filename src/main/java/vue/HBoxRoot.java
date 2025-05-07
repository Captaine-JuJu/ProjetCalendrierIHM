package vue;

import controleur.Controleur;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import modele.Planning;
import modele.PlanningCollection;

public class HBoxRoot extends HBox {
    private static PlanningCollection planning;
    private static Controleur controleur;
    private static GridPane calendrierPane;
    private static GridPaneFormulaireReservation reservationPane;

    public HBoxRoot() {
        super(30);
        VBoxCalendrier vBoxCalendrier = new VBoxCalendrier();
        GridPaneFormulaireReservation gridPaneFormulaireReservation = new GridPaneFormulaireReservation();
        PlanningCollection planning = new PlanningCollection();
        Controleur controleur = new Controleur();
        GridPane calendrierPane = new GridPane();
        GridPaneFormulaireReservation calendrierFormulaireReservation = new GridPaneFormulaireReservation();
        this.getChildren().addAll(vBoxCalendrier, gridPaneFormulaireReservation, calendrierPane);
    }

    public static PlanningCollection getPlanning(){
        return planning;
    }

    public static Controleur getControleur(){
        return controleur;
    }

    public static GridPane getCalendrierPane(){
        return calendrierPane;
    }

    public static GridPaneFormulaireReservation getReservationPane(){
        return reservationPane;
    }


}
