package exo4;

import java.util.Arrays;

public class Person {

	// Class variables
	private String name;
	private int age;
	private float soldes[];
	private static int numberOfPeople = 0;

	// Constructor with default values
	public Person() {
		this.name = "mohammed";
		this.age = 20;
		this.soldes = new float[] {14.0f,2400.4f,34.88f};
		numberOfPeople++;
	}

	// Constructor with parameters
	public Person(String name, int age, float[] soldes) {
		super();
		this.name = name;
		this.age = age;
		this.soldes = soldes;
		numberOfPeople++;
	}

	// Copy constructor
	public Person(Person p) {
		this.name = p.name;
		this.age = p.age;
		this.soldes = p.soldes;
		numberOfPeople++;
	}
	
	// Getter method for numberOfPeople variable
	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	// Getter and Setter methods for name variable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter and Setter methods for age variable
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Getter and Setter methods for soldes array variable
	public float[] getSoldes() {
		return soldes;
	}

	public void setSoldes(float[] soldes) {
		this.soldes = soldes;
	}

	// Override toString method to print object details
	@Override
	public String toString() {
		return "Person (name:" + name + ", age:" + age + ", soldes:" + Arrays.toString(soldes) + ")";
	}
	
	// Override finalize method to release the resource for soldes array
	@Override
    protected void finalize() throws Throwable {
        super.finalize();
        soldes = null; 
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        Person p1 = new Person(); // create a new Person object with default values
        System.out.println(p1); // print the object details
        System.out.println("Number of People: " + p1.getNumberOfPeople()); // print the number of Person objects created
        
        float[] soldes = {10.0f, 20.0f, 30.0f};
        Person p2 = new Person("John Doe", 30, soldes); // create a new Person object with provided values
        System.out.println(p2); // print the object details
        System.out.println("Number of People: " + p2.getNumberOfPeople()); // print the number of Person objects created
    }

}
