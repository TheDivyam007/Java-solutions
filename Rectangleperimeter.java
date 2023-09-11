import java.util.Scanner;

public class Rectangleperimeter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the perimeter of the rectangle
        double perimeter = calculateRectanglePerimeter(length, width);

        // Display the result
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the perimeter of a rectangle
    public static double calculateRectanglePerimeter(double length, double width) {
        // Use the formula P = 2 * (length + width)
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
