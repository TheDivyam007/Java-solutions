import java.util.Scanner; 
interface Resizable { 
 void resizeWidth(int width); 
 void resizeHeight(int height); 
} 
class Rectangle implements Resizable { 
 private int width; 
 private int height; 
public Rectangle(int width, int height) { 
this.width = width; 
this.height = height; 
 } 
 @Override 
 public void resizeWidth(int width) { 
 if (width >= 0) { 
this.width = width; 
 } else { 
System.out.println("Width cannot be negative."); 
 } 
 } 
 @Override 
 public void resizeHeight(int height) { 
 if (height >= 0) { 
this.height = height; 
 } else { 
System.out.println("Height cannot be negative."); 
 } 
 } 
public void displayDimensions() { 
System.out.println("Rectangle Dimensions: Width = " + width + ", Height = " + height); 
 } 
} 
public class SEVEN { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in);  
System.out.print("Enter initial width of the rectangle: "); 
 int initialWidth = scanner.nextInt(); 
System.out.print("Enter initial height of the rectangle: "); 
 int initialHeight = scanner.nextInt(); 
Rectangle rectangle = new Rectangle(initialWidth, initialHeight); 
System.out.println("\nOriginal Rectangle Dimensions:"); 
rectangle.displayDimensions(); 

System.out.print("\nEnter new width for resizing: "); 
 int newWidth = scanner.nextInt(); 
System.out.print("Enter new height for resizing: "); 
 int newHeight = scanner.nextInt(); 
rectangle.resizeWidth(newWidth); 
rectangle.resizeHeight(newHeight); 
System.out.println("\nResized Rectangle Dimensions:"); 
rectangle.displayDimensions(); 
scanner.close(); 
 } 
} 