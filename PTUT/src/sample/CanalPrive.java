package sample;

import java.util.List;

public class CanalPrive extends CanalDeDiscussion{
    //Attribut
    private String nomCanalUtilisateur;

    //Association bidirectionelle avec Profil
    private final List<Profil> monInterlocuteur; //Ils sont 2

    //Constructeur par default
    public CanalPrive(String nomCanalUtilisateur, String nomCanal, List<Profil> monInterlocuteur) {
        super(nomCanal);
        this.nomCanalUtilisateur = nomCanalUtilisateur;
        this.monInterlocuteur = monInterlocuteur;
    }

    //Méthode
    public void inviter() {
        // TODO implement here
    }

    //Getters et Setter
    public String getNomCanalUtilisateur() {
        return nomCanalUtilisateur;
    }

    public void setNomCanalUtilisateur(String nomCanalUtilisateur) {
        this.nomCanalUtilisateur = nomCanalUtilisateur;
    }

    public List<Profil> getMonInterlocuteur() { return monInterlocuteur; }
}