/*43. Write a language program which accepts the radius of a circle from the user and compute the area and circumference.   
Sample Output:
Find the area and circumference of any circle :
----------------------------------------------------
Input the radius(1/2 of diameter) of a circle : 5
The area of the circle is : 78.5397
The circumference of the circle is : 31.4159
*/

 import java.util.Scanner;
public class Circle
{
   public static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
       System.out.println("Find the area and circumference of any circle :");
       System.out.println("--------------------\n");
      System.out.print("Enter the radius of circle: ");
     double radius = sc.nextDouble();
     
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
  
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}


