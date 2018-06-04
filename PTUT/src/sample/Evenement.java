package sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evenement {
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
    public Evenement(String nom, Date date, List<Profil> mesParticipants) {

        this.nom = nom;
        this.date = date;
        this.mesParticipants = mesParticipants;
        this.mesMatchs = new ArrayList<>();
        this.maDiscussion = new CanalGroupe(nom,nom,mesParticipants);

    }

    public void finalize(){}

    //Méthodes
    public void consulterEve() {

     //   return ;

    }

    public void rejoindreEve(Profil membre) {

        this.mesParticipants.add(membre);

    }

    public void quitterEve(Profil membre) {

        this.mesParticipants.remove(membre);

    }

    public void rechercherEvenement(BaseDeDonnees estExistant) {

        // TODO implement here
    }

    //Getters et Setters
    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public List<Match> getTotalMatchs(){ return mesMatchs; }

    public List<Profil> getMesParticipants() { return mesParticipants; }

    public CanalGroupe getMaDiscussion() { return maDiscussion; }

}