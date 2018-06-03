package sample;

import java.util.List;

public class Match {
    //Attribut
    private boolean estOfficiel;

    //Classe-association
    private final List<Profil> mesJoueurs;

    //Constructeur par default
    public Match(boolean of, List<Profil> mesJoueurs) {
        estOfficiel = of;
        this.mesJoueurs = mesJoueurs;
    }

    public boolean isEstOfficiel() { return estOfficiel; }

    public void setEstOfficiel(boolean estOfficiel) { this.estOfficiel = estOfficiel; }

    public List<Profil> getMesJoueurs() { return mesJoueurs; }
}