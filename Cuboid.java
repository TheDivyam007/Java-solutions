import java.lang.*;
import java.util.*;
class Cuboid
{
    public static void main(String args[])
    {
        float length, breadth, height;
        float area, volume;
        Scanner sc=new Scanner(System.in);
        System.out.println("The length, breadth and height is: ");
        length=sc.nextFloat();
        breadth=sc.nextFloat();
        height=sc.nextFloat();
        
        area = 2*(length*breadth+breadth*height+height*length);
        volume = length*breadth*height;
        
        System.out.println("The Area will be: "+area);
        System.out.println("The Volume will be: "+volume);
    }
}