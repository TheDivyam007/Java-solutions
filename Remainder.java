import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the remainder using the modulus operator
        int remainder = num1 % num2;

        // Print the remainder
        System.out.println("The remainder of " + num1 + " divided by " + num2 + " is " + remainder);

        // Close the scanner
        scanner.close();
    }
}
