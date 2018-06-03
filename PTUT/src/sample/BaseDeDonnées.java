package sample;

import java.util.List;

public class BaseDeDonnées {
    //Attributs
    private List<Integer> listeDesScores;
    private boolean estAuthentifie;
    private boolean estExistant;

    //Constructeur par default
    public BaseDeDonnées (List<Integer> listeDesScores, boolean estAuthentifie, boolean estExistant) {
        this.listeDesScores = listeDesScores;
        this.estAuthentifie = estAuthentifie;
        this.estExistant = estExistant;
    }

    //Méthodes
    public void stockerDonnéesInscription() {
        // TODO implement here
    }
    public void enregistrerSuppressionCompte() {
        // TODO implement here
    }

    //Getters et Setter
    public List<Integer> getListeDesScores() {
        return listeDesScores;
    }

    public boolean isEstAuthentifie() {
        return estAuthentifie;
    }

    public void setEstAuthentifie(boolean estAuthentifie) {
        this.estAuthentifie = estAuthentifie;
    }

    public boolean isEstExistant() {
        return estExistant;
    }

    public void setEstExistant(boolean estExistant) {
        this.estExistant = estExistant;
    }
}