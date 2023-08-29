public class Divyam_30 {
    public static void main(String[] args) {
        // Define the range of numbers from 1000 to 2000 (both included)
        int startRange = 1000;
        int endRange = 2000;

        System.out.println("Numbers divisible by 8 and multiple of 5, between 1000 and 2000:");

        // Loop through the range and check each number
        for (int number = startRange; number <= endRange; number++) {
            // Check if the number is divisible by 8 and multiple of 5
            if (number % 8 == 0 && number % 5 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
