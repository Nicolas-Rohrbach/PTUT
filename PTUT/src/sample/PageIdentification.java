package sample;

public class PageIdentification {
    //Attributs
    private String login;
    private String motDePasse;

    //Constructeur par default
    public PageIdentification(String login, String motDePasse) {
        this.login = login;
        this.motDePasse = motDePasse;
    }

    //Méthodes
    public String authentifier(String login, String motDePasse){
        // TODO implement here
        return null;
    }

    public void setAuthentification(BaseDeDonnées estAuthentifie){
        // TODO implement here
    }

    public void inscrire() {
        // TODO implement here
    }

    public void afficherPageInscription() {
        // TODO implement here
    }

    public void afficherPageConnexion() {
        // TODO implement here
    }

    public void modifierMDP(String newmdp) {
        motDePasse = newmdp;
    }

    //Getters et Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

}