import java.util.Scanner;

public class CompositeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (isComposite(number)) {
            System.out.println(number + " is a composite number.");
        } else {
            System.out.println(number + " is not a composite number (it may be prime).");
        }

        scanner.close();
    }

    // Function to check if a number is composite
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not considered composite.
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true; // Found a factor other than 1 and itself; it's a composite number.
            }
        }
        
        return false; // No factors other than 1 and itself; it's not a composite number (possibly prime).
    }
}
