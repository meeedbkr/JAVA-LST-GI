package exo1;

public class Main {

    public static void main(String[] args) {
        // Creating a date object
        Date birthDate = new Date(1, 1, 1990);
        System.out.println("Birth date: " + birthDate);

        // Creating a person object
        Person person = new Person("John Doe", birthDate);
        System.out.println("Person: " + person);

        // Creating a person with lieu object
        PersonWithLieu personWithLieu = new PersonWithLieu("Jane Doe", birthDate, "Paris");
        System.out.println("Person with lieu: " + personWithLieu);
    }
}
