package exo1;

import java.util.Scanner;

public class Surface {

    // Method to calculate the surface of a circle with a given radius
    public static double calculateCircleSurface(float radius) {
        double surface = Math.PI * Math.pow(radius, 2); // Formula for calculating circle surface area
        return surface;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        double surfaceArea;
        float radius;

        // Ask the user to enter a non-negative value for the radius of the circle
        do {
            System.out.println("Enter the radius of the circle: ");
            radius = scanner.nextFloat();
        } while (radius < 0);

        // Calculate the surface area of the circle
        surfaceArea = calculateCircleSurface(radius);

        // Display the result
        System.out.println("The surface area of a circle with radius " + radius + " is " + surfaceArea);
    }

}
