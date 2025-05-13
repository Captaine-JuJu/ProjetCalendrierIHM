package vue;

import controleur.Controleur;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import modele.CalendrierDuMois;
import modele.ConstantesCalendrier;
import modele.Date;

import static modele.ConstantesCalendrier.*;

public class GridPaneFormulaireReservation extends GridPane implements ConstantesCalendrier {
    private Label labelTitle;
    public GridPaneFormulaireReservation() {

        //Date du jour

//        Date today = new Date();
//        Label labelTitle = new Label(today.getJour() + " " + MOIS[today.getMois()-1] + " " + today.getAnnee());




        Label labelCours = new Label("Cours");
        Label labelNiveau = new Label("Niveau");
        Label labelHoraire = new Label("Horaire");

        TextField textField = new TextField();


        Label labelDebutant = new Label("Debutant");
        Label labelMoyen  = new Label("Moyen");
        Label labelAvance = new Label("Avancé");
        Label labelExpert = new Label("Expert");

        ToggleGroup radioGroup = new ToggleGroup();

        RadioButton radioButtonDebutant = new RadioButton();
        RadioButton radioButtonMoyen = new RadioButton();
        RadioButton radioButtonAvance = new RadioButton();
        RadioButton radioButtonExpert = new RadioButton();

        radioGroup.getToggles().addAll(radioButtonDebutant, radioButtonMoyen, radioButtonAvance, radioButtonExpert);

        ComboBox<String> heureDepart;
        heureDepart = peupleComboBox(HEURES);
        ComboBox<String> minuteDepart;
        minuteDepart = peupleComboBox(MINUTES);
        ComboBox<String> heureFin;
        heureFin = peupleComboBox(HEURES);
        ComboBox<String> minuteFin;
        minuteFin = peupleComboBox(MINUTES);

        Button boutonAnnuler = new Button("Annuler");
        boutonAnnuler.setOnAction(new Controleur());
        Button boutonEnregistrer = new Button("Enregistrer");
        boutonEnregistrer.setOnAction(HBoxRoot.getControleur());

        //espace pour H et V
        this.setHgap(10);
        this.setVgap(10);

        this.add(labelTitle, 2, 0,2,1);
        //                     x,   y, largeur,hauteur

        this.add(labelCours, 0, 1,1,1);
        this.add(textField, 1, 1,5,1);
        this.add(labelNiveau, 0, 2,1,1);
        this.add(labelHoraire, 0, 4,1,1);

        //Radio Button
        this.add(radioButtonDebutant, 1, 2,1,1);
        this.add(radioButtonMoyen, 3, 2,1,1);
        this.add(radioButtonAvance, 1, 3,1,1);
        this.add(radioButtonExpert, 3, 3,1,1);

        //Nom Radio Button
        this.add(labelDebutant, 2, 2,1,1);
        this.add(labelMoyen, 4, 2,1,1);
        this.add(labelAvance, 2, 3,1,1);
        this.add(labelExpert, 4, 3,1,1);

        //ComboBox ajout
        this.add(heureDepart, 2, 4, 1, 1);
        this.add(heureFin, 2, 5, 1, 1);
        this.add(minuteDepart, 4, 4, 1, 1);
        this.add(minuteFin, 4, 5, 1, 1);


        //bouton annuler et enregistrer
        this.add(boutonAnnuler, 2, 6, 1, 1);
        this.add(boutonEnregistrer, 4, 6, 1, 1);



    }

    private ComboBox<String> peupleComboBox(String[] strings) {
        ComboBox<String> comboBox = new ComboBox<>();
        for(String string : strings) {
            comboBox.getItems().add(string);
        }
        comboBox.setValue(strings[0]);
        return comboBox;
    }

    public void setDate(Date date) {
        labelTitle.setText(date.getJour() + " " + date.getMois() + " " + date.getAnnee());
    }
}
