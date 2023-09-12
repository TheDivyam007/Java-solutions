import java.util.Scanner;

public class CubeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the length of a side of the cube
        System.out.print("Enter the length of a side of the cube: ");
        double sideLength = scanner.nextDouble();
        
        // Calculate the total surface area of the cube
        double surfaceArea = 6 * sideLength * sideLength;
        
        // Display the result
        System.out.println("The total surface area of the cube is: " + surfaceArea);
        
        // Close the scanner
        scanner.close();
    }
}
