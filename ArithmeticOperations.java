import java.util.Scanner; 
public class ArithmeticOperations { 

 public int add(int a, int b) { 
 return a + b; 
 } 
 public int add(int a, int b, int c) { 
 return a + b + c; 
 } 
 public int subtract(int a, int b) { 
 return a - b; 
 } 
 public int multiply(int a, int b) { 
 return a * b; 
 } 
 
 public double divide(int a, int b) { 
 if (b != 0) { 
 return (double) a / b; 
 } else { 
System.out.println("Division by zero is not allowed."); 
 return Double.NaN; 
 } 
 } 
public static void main(String[] args) { 
ArithmeticOperations calculator = new ArithmeticOperations(); 
 Scanner scanner = new Scanner(System.in); 
System.out.print("Enter the first integer: "); 
 int num1 = scanner.nextInt(); 
System.out.print("Enter the second integer: "); 
 int num2 = scanner.nextInt(); 
 int sum1 = calculator.add(num1, num2); 
 int difference = calculator.subtract(num1, num2); 
 int product = calculator.multiply(num1, num2); 
 double quotient = calculator.divide(num1, num2); 
System.out.println("Sum: " + sum1); 
System.out.println("Difference: " + difference); 
System.out.println("Product: " + product); 
System.out.println("Quotient: " + quotient); 
scanner.close();  
 } 
}