import java.util.Scanner;

class TrafficSignal {
    private String color;
    private int duration;

    public TrafficSignal(String initialColor, int initialDuration) {
        color = initialColor;
        duration = initialDuration;
    }

    public void changeColor(String newColor, int newDuration) {
        color = newColor;
        duration = newDuration;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }
}

public class TrafficSignalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial color of the traffic signal: ");
        String initialColor = scanner.next();

        System.out.print("Enter the initial duration (in seconds): ");
        int initialDuration = scanner.nextInt();

        TrafficSignal trafficSignal = new TrafficSignal(initialColor, initialDuration);

        System.out.println("Traffic Signal Status:");
        System.out.println("Color: " + trafficSignal.getColor());
        System.out.println("Duration: " + trafficSignal.getDuration() + " seconds");

        System.out.print("\nEnter the new color for the traffic signal: ");
        String newColor = scanner.next();

        System.out.print("Enter the new duration (in seconds): ");
        int newDuration = scanner.nextInt();

        trafficSignal.changeColor(newColor, newDuration);

        System.out.println("\nUpdated Traffic Signal Status:");
        System.out.println("Color: " + trafficSignal.getColor());
        System.out.println("Duration: " + trafficSignal.getDuration() + " seconds");

        System.out.println("\nIs the traffic signal currently red? " + trafficSignal.isRed());
        System.out.println("Is the traffic signal currently green? " + trafficSignal.isGreen());

        scanner.close();
    }
}
