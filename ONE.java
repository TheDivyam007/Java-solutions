import java.util.Scanner; 
class Person { 
 private String name; 
 private int age; 
 public Person(String name, int age) { 
 this.name = name; 
this.age = age; 
 } 
 public String getName() { 
 return name; 
 } 
 public int getAge() { 
 return age; 
 } 
} 
public class ONE { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
System.out.print("Enter the name of the first person: "); 
 String name1 = scanner.nextLine(); 
System.out.print("Enter the age of the first person: "); 
 int age1 = scanner.nextInt(); 
scanner.nextLine(); // Consume the newline character 
System.out.print("Enter the name of the second person: "); 
 String name2 = scanner.nextLine(); 
System.out.print("Enter the age of the second person: "); 
 int age2 = scanner.nextInt(); 
 Person person1 = new Person(name1, age1); 
 Person person2 = new Person(name2, age2); 
System.out.println("\nPerson 1:"); 
System.out.println("Name: " + person1.getName()); 
System.out.println("Age: " + person1.getAge()); 
System.out.println("\nPerson 2:"); 
System.out.println("Name: " + person2.getName()); 
System.out.println("Age: " + person2.getAge()); 
scanner.close(); 
 } 
}