package exo3;

public class Somme {
	private int NumAtt;
	private String StringAtt;

	// Constructor to set default values
	public Somme() {
		this.NumAtt = 10;
		this.StringAtt = "aaaa";
	}

	// Getters and setters for instance variables
	public int getNumAtt() {
		return NumAtt;
	}

	public void setNumAtt(int numAtt) {
		NumAtt = numAtt;
	}

	public String getStringAtt() {
		return StringAtt;
	}

	public void setStringAtt(String stringAtt) {
		StringAtt = stringAtt;
	}

	// Method to add two integers
	public int add(int a, int b) {
		return a + b;
	}

	// Method to add two floats
	public float add(float a, float b) {
		return a + b;
	}

	// Method to concatenate two strings
	public String add(String a, String b) {
		return a + b;
	}

	// Method to add two Somme objects and store the result in a new Somme object
	public void add(Somme a,Somme b) {
		this.setNumAtt(this.add(a.NumAtt, b.NumAtt));
		this.setStringAtt(this.add(a.StringAtt, b.StringAtt));
	}

	// Main method to test the functionality of the Somme class
	public static void main(String[] args) {
		// Create two Somme objects
		Somme somme1 = new Somme();
		Somme somme2 = new Somme();

		// Set the instance variables of the first object
		somme1.setNumAtt(20);
		somme1.setStringAtt("bbbb");

		// Set the instance variables of the second object
		somme2.setNumAtt(30);
		somme2.setStringAtt("cccc");

		// Create a new Somme object and add the two objects
		Somme result = new Somme();
		result.add(somme1, somme2);

		// Print the result
		System.out.println("NumAtt: " + result.getNumAtt());
		System.out.println("StringAtt: " + result.getStringAtt());
	}
}

