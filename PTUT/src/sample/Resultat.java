package sample;

import java.util.List;

public class Resultat {
    //Attribut
    private int score;

    //Aggregation avec Classement
    private final Classement monNouveauClassement;

    //Classe-association
    private final List<Match> mesMatchsJoues;
    private final List<Profil> mesJoueurs; // Ne pas oublier de mettre une liste de 2 ou 4 joueurs

    //Constructeur par default
    public Resultat(int score, Classement monNouveauClassement, List<Match> mesMatchsJoues, List<Profil> mesJoueurs) {
        this.score = score;
        this.monNouveauClassement = monNouveauClassement;
        this.mesMatchsJoues = mesMatchsJoues;
        this.mesJoueurs = mesJoueurs;
    }

    //Méthode
    public void entrerScore(int score) {
        this.score = score;
    }

    //Getters et Setter
    public List<Match> getMesMatchsJoues() {
        return mesMatchsJoues;
    }

    public List<Profil> getMesJoueurs() {
        return mesJoueurs;
    }

    public Classement getMonNouveauClassement() {
        return monNouveauClassement;
    }

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }
}