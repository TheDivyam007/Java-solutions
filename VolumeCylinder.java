import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the cylinder
        System.out.print("Enter the radius of the cylinder (in meters): ");
        double radius = scanner.nextDouble();

        // Prompt the user to enter the height of the cylinder
        System.out.print("Enter the height of the cylinder (in meters): ");
        double height = scanner.nextDouble();

        // Calculate the volume of the cylinder
        double volume = calculateCylinderVolume(radius, height);

        // Display the result
        System.out.println("The volume of the cylinder is: " + volume + " cubic meters");

        // Close the scanner
        scanner.close();
    }

    // Function to calculate the volume of a cylinder
    public static double calculateCylinderVolume(double radius, double height) {
        // Define the value of pi
        double pi = Math.PI;

        // Calculate the volume using the formula V = πr²h
        double volume = pi * Math.pow(radius, 2) * height;

        return volume;
    }
}
