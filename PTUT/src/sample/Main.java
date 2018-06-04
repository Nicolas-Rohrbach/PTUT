package sample;

import javafx.application.Application;
import javafx.beans.property.ListPropertyBase;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javax.swing.text.TableView;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }


    //Affiche la page d'inscription en fxml
    @Override
    public void start(Stage stage) {
        //Exemple d'application mais à modifier ou supprimer parce que c'est nul

        List<Profil> joueurs = new ArrayList<>();

        Classement classement = new Classement(0,joueurs,);

        Date date = new Date(1998-1900,06,20,10,50);

        Profil Emma = new Profil("TARFI", "Emma", "Algpo", "emma.tarfi@sfr.fr", "90 avenue saint joseph", 13290,classement);

        joueurs.add(Emma);

        Evenement evenement = new Evenement("Tournoi de babyfoot à Marseille",date,joueurs);

        System.out.println(Emma.getPrenom() + " " + Emma.getNom() + " consulte le canal de discussion : " + evenement.getMaDiscussion().getNomCanalEve());
        System.out.println("L'événement: " + evenement.getNom() + " aura lieu le " + evenement.getDate());
    }
}