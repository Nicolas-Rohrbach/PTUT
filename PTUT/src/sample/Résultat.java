package sample;

import java.util.List;

public class Résultat {
    //Attribut
    private int score;

    //Aggregation avec Classement
    private final Classement monNouveauClassement;

    //Classe-association
    private final List<Match> mesMatchsJoués;
    private final List<Profil> mesJoueurs; // Ne pas oublier de mettre une liste de 2 ou 4 joueurs

    //Constructeur par default
    public Résultat(int score, Classement monNouveauClassement, List<Match> mesMatchsJoués, List<Profil> mesJoueurs) {
        this.score = score;
        this.monNouveauClassement = monNouveauClassement;
        this.mesMatchsJoués = mesMatchsJoués;
        this.mesJoueurs = mesJoueurs;
    }

    //Méthode
    public void entrerScore(int score) {
        this.score = score;
    }

    //Getters et Setter
    public List<Match> getMesMatchsJoués() {
        return mesMatchsJoués;
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