import java.lang.*;
import java.util.*;
class Area
{
    public static void main(String args[])
    {
      float s;
      double area;
      int a,b,c;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 3 sides of triangle: ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      
      s=(a+b+c)/2f;
      
      area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("The Area is: "+area);
    }
}