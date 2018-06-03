package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public class InscriptionControl extends GridPane {
    @FXML
    private GridPane grid;

    @FXML
    private Rectangle bandeau;

    @FXML
    private TextField txtfield;

    @FXML
    private ImageView logo;

    @FXML
    private VBox menu;

    @FXML
    private Label userid;

    public InscriptionControl() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "/fr/univ_amu/iut/Inscription.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @FXML
    private void initialize() {

    }
}
        /*####################
        // création de la bannière
        Rectangle banniere = new Rectangle();
        banniere.setX(0);
        banniere.setY(0);
        banniere.setWidth(1920);
        banniere.setHeight(100);
        banniere.setFill(Color.BLACK);
        // création du sol
    //    Rectangle ground = new Rectangle(0, 400, 800, 200);
     //   ground.setFill(Color.WHITE);
        // création d'un élément plus complexe, le panneau
        Group sign = new Group();
        sign.setTranslateX(100);
        sign.setTranslateY(80);
        // Attention les coordonnées sont celles du panneau, pas de la scène
        Text text = new Text(700, -15, "Seek'n'Play");
        text.setFont(new Font(40));
        text.setFill(Color.WHITE);
        // Attention les coordonnées sont celles du panneau, pas de la scène
        Text text1 = new Text(-30, 250, "Connexion");
        text1.setFont(new Font(25));
        text1.setFill(Color.WHITE);
        // Attention les coordonnées sont celles du panneau, pas de la scène
        Text text2 = new Text(-50, 400, "Accueil");
        text2.setFont(new Font(25));
        text2.setFill(Color.WHITE);
        // Attention les coordonnées sont celles du panneau, pas de la scène
        Text text3 = new Text(-50, 475, "Evénements");
        text3.setFont(new Font(25));
        text3.setFill(Color.WHITE);
        // Attention les coordonnées sont celles du panneau, pas de la scène
        Text text4 = new Text(-50, 535, "A venir");
        text4.setFont(new Font(25));
        text4.setFill(Color.WHITE);
        // Attention les coordonnées sont celles du panneau, pas de la scène
        Text text5 = new Text(-50, 600, "Classement");
        text5.setFont(new Font(25));
        text5.setFill(Color.WHITE);
        // Attention les coordonnées sont celles du panneau, pas de la scène
        Text text6 = new Text(-50, 675, "Inscription");
        text6.setFont(new Font(25));
        text6.setFill(Color.WHITE);
        // Attention les coordonnées sont celles du panneau, pas de la scène
        Text textA = new Text(300, 300, "Inscription");
        textA.setFont(new Font(50));
        textA.setFill(Color.BLACK);
        // le repère utilisé est celui du panneau
        Rectangle panel = new Rectangle(-100, 0, 320, 1000);
        panel.setFill(Color.BLACK);
        // composer l'élément plus complexe
        sign.getChildren().add(panel);
        sign.getChildren().addAll(text,text1,text2,text3,text4,text5,text6,imagea,textA);
        // ajout de tous les éléments de la scène
        root.getChildren().add(banniere);
        //root.getChildren().add(ground);
        root.getChildren().add(sign);
        #######################*/
