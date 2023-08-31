import java.util.Scanner;

public class MirrorImage {

    // Function to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the function to reverse the input string
        String Divyam_30 = reverseString(input);

        System.out.println("Mirror image of the given string: " + Divyam_30);

        scanner.close();
    }
}
