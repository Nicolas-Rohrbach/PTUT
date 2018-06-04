package sample;

import java.util.List;

public class Classement {
    //Attribut
    private int rangJoueur;

    //Reference association bidirectionelle avec Profil
    private final List<Profil> mesJoueursClasses;

    //Reference aggregation avec Résultat
    private final List<Resultat> mesResultats;

    //Constructeur par default
    public Classement(int rangJoueur, List<Profil> mesJoueursClasses, List<Resultat> mesResultats) {
        this.rangJoueur = rangJoueur;
        this.mesJoueursClasses = mesJoueursClasses;
        this.mesResultats = mesResultats;
    }

    //Dependance avec BaseDeDonnees
    public void afficherClassement(List<BaseDeDonnees> listeDesScores) {
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

    public List<Resultat> getMesResultats() {
        return mesResultats;
    }

    public List<Profil> getMesJoueursClasses() {
        return mesJoueursClasses;
    }
}