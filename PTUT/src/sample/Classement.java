package sample;

import java.util.List;

public class Classement {
    //Attribut
    private int rangJoueur;

    //Reference association bidirectionelle avec Profil
    private final List<Profil> mesJoueursClassés;

    //Reference aggregation avec Résultat
    private final List<Résultat> mesRésultats;

    //Constructeur par default
    public Classement(int rangJoueur, List<Profil> mesJoueursClassés, List<Résultat> mesRésultats) {
        this.rangJoueur = rangJoueur;
        this.mesJoueursClassés = mesJoueursClassés;
        this.mesRésultats = mesRésultats;
    }

    //Dépendance avec BaseDeDonnées
    public void afficherClassement(List<BaseDeDonnées> listeDesScores) {
        // TODO implement here
    }

    //Méthodes
    public void consulterClassement() {
        // TODO implement here
    }
    private void majClassement() {
        // TODO implement here
    }

    //Getters et Setter
    public int getRangJoueur() {
        return rangJoueur;
    }

    public void setRangJoueur(int rangJoueur) {
        this.rangJoueur = rangJoueur;
    }

    public List<Résultat> getMesRésultats() {
        return mesRésultats;
    }

    public List<Profil> getMesJoueursClassés() {
        return mesJoueursClassés;
    }
}