package sample;

import java.util.List;

public class CanalGroupe extends CanalDeDiscussion{
    //Attribut
    private String nomCanalEve;

    //Association bidirectionelle avec Profil
    private final List<Profil> participantsEve;

 /*   //Aggrégation avec Événement
    private final Événement unÉvénement;

    //Constructeur par default
    public CanalGroupe(String nomCanalEve, String nomCanal, Profil participantsEve[], Événement unÉvénement) {
        super(nomCanal);
        this.nomCanalEve = nomCanalEve;
        this.participantsEve = participantsEve;
        this.unÉvénement = unÉvénement;
    }*/

    public CanalGroupe(String nomCanalEve, String nomCanal, List<Profil> participantsEve) {
        super(nomCanal);
        this.nomCanalEve = nomCanalEve;
        this.participantsEve = participantsEve;
    }

    //Getters et Setter
    public String getNomCanalEve() {
        return nomCanalEve;
    }

    public void setNomCanalEve(String nomCanalEve) {
        this.nomCanalEve = nomCanalEve;
    }

    public List<Profil> getParticipantsEve() {
        return participantsEve;
    }

//    public Événement getUnÉvénement() { return unÉvénement; }
}