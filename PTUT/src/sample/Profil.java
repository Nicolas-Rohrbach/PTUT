package sample;

import java.util.ArrayList;
import java.util.List;

public class Profil {
    //Attributs
    private String nom;
    private String prenom;
    private String pseudo;
    private String adresseMail;
    private String adressePostale;
    private int codePostale;

    private List<Profil> ListeAmi;

    //Aggrégation avec Événement
    private final List<Evenement> desEveCrees;

    //Association bidirectionnelle avec Classement
    private final Classement monClassement;

    //Association bidirectionnelle avec CanalPrivé
    private final List<CanalPrive> mesCanaux;

    //Association bidirectionnelle avec CanalGroupe
    private final List<CanalGroupe> forumEve;

    //Classe-association
    private final List<Resultat> mesMatchsJoues; // 2 ou 4 joueurs

    //Constructeur par default
    public Profil(String nom, String prenom, String pseudo, String adresseMail,
                  String adressePostale, int codePostale, Classement classement) {

        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
        this.codePostale = codePostale;
        this.desEveCrees = new ArrayList<>();
        this.monClassement = classement;
        this.mesCanaux = new ArrayList<>();
        this.forumEve = new ArrayList<>();
        this.mesMatchsJoues = new ArrayList<>();
        this.ListeAmi = new ArrayList<>();
    }

    //Méthodes
    public void consulterProfil() {
        // TODO implement here
    }

    public void modifierProfil() {
        // TODO implement here
    }
    public void demanderNvMotDePasse() {
        // TODO implement here
    }
    public void connexionProfil(BaseDeDonnees estAuthentifie) {
        // TODO implement here
    }
    public void envoyerMailDenouvMDP() {
        // TODO implement here
    }
    public void envoyerMailConfirmationInscription() {
        // TODO implement here
    }
    public void ajouterAmi(Profil Ami) {

        this.ListeAmi.add(Ami);

    }

    //Getters et Setters
    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getPrenom() {

        return prenom;
    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }

    public String getPseudo() {

        return pseudo;
    }

    public void setPseudo(String pseudo) {

        this.pseudo = pseudo;
    }

    public String getAdresseMail() {

        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {

        this.adresseMail = adresseMail;

    }

    public String getAdressePostale() {

        return adressePostale;
    }

    public void setAdressePostale(String adressePostale) {

        this.adressePostale = adressePostale;
    }

    public int getCodePostale() {

        return codePostale;
    }

    public void setCodePostale(int codePostale) {

        this.codePostale = codePostale;
    }

    public List<Evenement> getDesEveCrees() {

        return desEveCrees;
    }

    public Classement getMonClassement() {

        return monClassement;
    }

    public List<Resultat> getMesMatchsJoues() {

        return mesMatchsJoues;
    }

    public List<CanalPrive> getMesCanaux() {

        return mesCanaux;
    }

    public List<CanalGroupe> getForumEve() {

        return forumEve;
    }
}