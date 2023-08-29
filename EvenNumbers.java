import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumbers {

    public static void printEvenNumbers(ArrayList<Integer> numbers) {
        System.out.println("Even numbers in the list:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        ArrayList<Integer> Divyam_30 = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            Divyam_30.add(num);
        }

        printEvenNumbers(Divyam_30);

        scanner.close();
    }
}
