import java.lang.*;
import java.util.*;
class AreaCylinder
{
    public static void main(String args[])
    {
        double surfacearea,radius,height;
        Scanner sc= new Scanner(System.in);
        System.out.println("The Radius is: ");
        radius = sc.nextDouble();
        System.out.println("The height is: ");
        height = sc.nextDouble();
        surfacearea = sc.nextDouble();
        
        surfacearea = 2 * Math.PI * radius *(height+radius);
        System.out.println("The Surface area is: "+surfacearea);
    }
}