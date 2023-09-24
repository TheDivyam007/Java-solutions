import java.util.Scanner;
interface Flyable { 
 void fly_obj(); 
} 
class Spacecraft implements Flyable { 
 @Override 
 public void fly_obj() { 
System.out.println("Spacecraft is flying in space."); 
 } 
} 
class Airplane implements Flyable { 
 @Override 
 public void fly_obj() { 
System.out.println("Airplane is flying in the sky."); 
 } 
} 
class Helicopter implements Flyable { 
 @Override 
 public void fly_obj() { 
System.out.println("Helicopter is flying in the air."); 
 } 
} 
public class EIGHT { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
System.out.println("Select the type of flying object:"); 
System.out.println("1. Spacecraft"); 
System.out.println("2. Airplane"); 
System.out.println("3. Helicopter"); 
 int choice = scanner.nextInt(); 
 Flyable flyingObject = null; 
 switch (choice) { 
 case 1: 
flyingObject = new Spacecraft(); 
 break; 
 case 2: 
flyingObject = new Airplane(); 
 break; 
 case 3: 
flyingObject = new Helicopter(); 
 break; 
 default: 
System.out.println("Invalid choice."); 
 break; 
 } 
 if (flyingObject != null) { 
flyingObject.fly_obj(); 
 } 
scanner.close(); 
 } 
} 