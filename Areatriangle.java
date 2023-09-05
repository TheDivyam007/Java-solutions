import java.lang.*;
import java.util.Scanner;
class Areatriangle
{
    public static void main(String args[])
    {
        float Area;
        float Base;
        float Height;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base and Height: ");
        Base = sc.nextFloat();
        Height = sc.nextFloat();
        Area = (Base*Height)/2;
        
        System.out.println("Area: "+Area);
    }
}
