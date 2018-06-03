package sample;

import java.util.Date;
import java.util.List;

public class Événement {
    //Attributs
    private String nom;
    private Date date;

    //Aggrégation avec Profil
    private final List<Profil> mesParticipants;

    //Composition avec Match
    private final List<Match> mesMatchs;

    //Aggrégation avec CanalGroupe
    private final CanalGroupe maDiscussion;

    //Constructeur par default
    public Événement(String nom, Date date, List<Profil> mesParticipants, List<Match> mesMatchs, CanalGroupe maDiscussion) {
        this.nom = nom;
        this.date = date;
        this.mesParticipants = mesParticipants;
        this.mesMatchs = mesMatchs;
        this.maDiscussion = maDiscussion;
    }

    //Méthodes
 /*   public void ajouterEve() {
        // TODO implement here
    } */
    public void consulterEve() {
        // TODO implement here
    }
    public void rejoindreEve(Profil membre) {
        mesParticipants.add(membre);
    }
    public void quitterEve() {
        // TODO implement here
    }
    public void modifierEve() {
        // TODO implement here
    }

    public void rechercherEvénement(BaseDeDonnées estExistant) {
        // TODO implement here
    }

    //Getters et Setters
    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public List<Match> getTotalMatchIn1Événement(){ return mesMatchs; }

    public List<Profil> getMesParticipants() { return mesParticipants; }

    public CanalGroupe getMaDiscussion() { return maDiscussion; }
}