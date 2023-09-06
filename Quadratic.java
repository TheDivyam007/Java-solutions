import java.lang.*;
import java.util.*;
class Quadratic
{
    public static void main(String args[])
    {
      int a,b,c;
      double r1, r2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the values of a, b and c: ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      
      r1= (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
      
      r2= (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
      System.out.println("1st root is: "+r1);
      System.out.println("2nd root is: "+r2);
    }
}