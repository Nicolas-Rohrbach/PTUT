package sample;

import javafx.application.Application;
import javafx.beans.property.ListPropertyBase;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javax.swing.text.TableView;
import java.time.Month;
import java.util.Date;
import java.util.List;

public class Main extends Application {

    private List<Match> matchs;

    private List<Profil> joueurs;


    public static void main(String[] args) {
        Application.launch(args);
    }


    //Affiche la page d'inscription en fxml
    @Override
    public void start(Stage stage) {
        //Exemple d'application mais à modifier ou supprimer parce que c'est nul

        Date date = new Date(1998-1900,06,20,10,50);
        Profil Emma = new Profil("TARFI", "Emma", "Algpo", "emma.tarfi@sfr.fr", "90 avenue saint joseph", 13290);

        joueurs.add(Emma);

        Match match = new Match(false,joueurs);

        matchs.add(match);

        CanalGroupe canalGroupe = new CanalGroupe("Banane","Test2",joueurs);

        Événement événement = new Événement("Tournoi de babyfoot à Marseille",date,joueurs,matchs,canalGroupe);

        System.out.println(Emma.getPrenom() + " " + Emma.getNom() + " consulte le canal de discussion : " + canalGroupe.getNomCanalEve());
        System.out.println("L'événement: " + événement.getNom() + " aura lieu le " + événement.getDate());
    }
}