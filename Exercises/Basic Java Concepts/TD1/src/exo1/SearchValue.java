package exo1;

import java.util.Scanner;

public class SearchValue {
    
    // function to search for an element in an array and return its index
    public static int search(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1; // return -1 if element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        int array[] = {11, 23, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int element, index;

        // Ask the user to enter the element to search for
        System.out.println("Enter the element to search for: ");
        element = scanner.nextInt();

        // Search for the element in the array
        index = search(array, element);

        // Display the result
        if(index != -1) {
            System.out.println("The index of " + element + " is " + index);
        } else {
            System.out.println("The element " + element + " doesn't exist in the array.");
        }
        
        scanner.close();
    }

}
