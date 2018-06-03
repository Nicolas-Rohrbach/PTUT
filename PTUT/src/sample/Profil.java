package sample;

import java.util.List;

public class Profil {
    //Attributs
    private String nom;
    private String prenom;
    private String pseudo;
    private String adresseMail;
    private String adressePostale;
    private int codePostale;

    //Aggrégation avec Événement
 /*   private final List<Événement> desEveCrées;

    //Association bidirectionnelle avec Classement
    private final Classement monClassement;

    //Association bidirectionnelle avec CanalPrivé
    private final List<CanalPrivé> mesCanaux;

    //Association bidirectionnelle avec CanalGroupe
    private final List<CanalGroupe> forumEve;

    //Classe-association
    private final List<Résultat> mesMatchsJoués; // 2 ou 4 joueurs

    public List<Résultat> getMesMatchsJoués() {
        return mesMatchsJoués;
    }*/

    //Constructeur par default
    public Profil(String nom, String prenom, String pseudo, String adresseMail,
                  String adressePostale, int codePostale/*,List<Événement> desEveCrées, Classement monClassement,
                  List<CanalPrivé> mesCanaux, List<CanalGroupe> forumEve, List<Résultat> mesMatchsJoués*/) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
        this.codePostale = codePostale;
 /*       this.desEveCrées = desEveCrées;
        this.monClassement = monClassement;
        this.mesCanaux = mesCanaux;
        this.forumEve = forumEve;
        this.mesMatchsJoués = mesMatchsJoués;*/
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
    public void connexionProfil(BaseDeDonnées estAuthentifie) {
        // TODO implement here
    }
    public void envoyerMailDenouvMDP() {
        // TODO implement here
    }
    public void envoyerMailConfirmationInscription() {
        // TODO implement here
    }
    public void ajouterAmi() {
        // TODO implement here
    }
    public void supprimerCompte() {
        // TODO implement here
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
/*
    public List<Événement> getDesEveCrées() { return desEveCrées; }

    public Classement getMonClassement() { return monClassement; }

    public List<CanalPrivé> getMesCanaux() { return mesCanaux; }

    public List<CanalGroupe> getForumEve() { return forumEve; } */
}