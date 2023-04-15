package exo1;

public class Date {
    private int jours;
    private int mois;
    private int annee;
    private static int anneeEnCours; // Static field to store the current year

    // Constructor with parameters
    public Date(int jours, int mois, int annee) {
        super();
        this.jours = jours;
        this.mois = mois;
        this.annee = annee;
    }

    // Getters and setters for the jours, mois, and annee fields
    public int getJours() {
        return jours;
    }

    public void setJours(int jours) {
        this.jours = jours;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Getter and setter for the static field anneeEnCours
    public static int getAnneeEnCours() {
        return anneeEnCours;
    }

    public static void setAnneeEnCours(int anneeEnCours) {
        Date.anneeEnCours = anneeEnCours;
    }

    // toString method to return a string representation of the object
    @Override
    public String toString() {
        return "( jours:" + jours + ", mois:" + mois + ", annee:" + annee +") " ;
    }
}
