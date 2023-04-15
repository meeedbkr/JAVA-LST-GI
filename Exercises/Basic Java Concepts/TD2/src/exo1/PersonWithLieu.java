package exo1;

// PersonWithLieu is a subclass of Person
public class PersonWithLieu extends Person {

    // Declare private instance variable lieuDeNaissance
    private String lieuDeNaissance;

    // Constructor that takes three parameters: name, dateDeNaissance, and lieuDeNaissance
    public PersonWithLieu(String name, Date dateDeNaissance, String lieuDeNaissance) {
        // Call the superclass constructor and pass name and dateDeNaissance
        super(name, dateDeNaissance);
        // Set lieuDeNaissance to the specified value
        this.lieuDeNaissance = lieuDeNaissance;
    }

    // Getter method for lieuDeNaissance
    public String getLieuDeNaissance() {
        return lieuDeNaissance;
    }

    // Setter method for lieuDeNaissance
    public void setLieuDeNaissance(String lieuDeNaissance) {
        this.lieuDeNaissance = lieuDeNaissance;
    }

    // Override the toString method to add lieuDeNaissance to the output
    @Override
    public String toString() {
        // Call the superclass toString method and concatenate it with lieuDeNaissance
        return super.toString() + "lieuDeNaissance: " + lieuDeNaissance;
    }
}
