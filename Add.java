import java.lang.*;
import java.util.*;
class Add{
    public static void main(String args[]){
        int num1, num2, Sum;
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        Sum = num1+num2;
        System.out.println("The sum is: "+Sum);



    }
}