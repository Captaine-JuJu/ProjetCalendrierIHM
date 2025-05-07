package vue;

import controleur.Contoleur;
import javafx.scene.control.Control;
import javafx.scene.layout.HBox;
import modele.CalendrierDuMois;
import modele.PlanningCollection;

public class HBoxRoot extends HBox {

    private static PlanningCollection planning;
    private static Control controleur;
    private static CalendrierDuMois calendrierPane;
    private static CalendrierDuMois reservationPane;

    public HBoxRoot() {

//    CalendrierDuMois calendrierPane = new CalendrierDuMois(int mois,int annee);


//        super(30);
        VBoxCalendrier vBoxCalendrier = new VBoxCalendrier();
        GridPaneFormulaireReservation gridPaneFormulaireReservation = new GridPaneFormulaireReservation();
        this.getChildren().addAll(vBoxCalendrier, gridPaneFormulaireReservation);
    }

    public static PlanningCollection getPlanningCollection(){
        return planning;
    }
    public static Contoleur getControleur(){
        return controleur;
    }
    public static CalendrierDu
}
