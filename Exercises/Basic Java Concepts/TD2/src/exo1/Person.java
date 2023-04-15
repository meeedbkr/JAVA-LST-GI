package exo1;

public class Person {
	
	// Instance variables
	private String name; // person's name
	private Date dateDeNaissance; // person's birth date
	
	// Constructor
	public Person(String name, Date dateDeNaissance) {
		super();
		this.name = name;
		this.dateDeNaissance = dateDeNaissance;
	}
	
	// Getters and setters for instance variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
	// toString method for printing the object as string
	@Override
	public String toString() {
		return "name:" + name + ", dateDeNaissance:" + dateDeNaissance;
	}

}
