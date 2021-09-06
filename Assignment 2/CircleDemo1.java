/*19. Write a program in JAVA to find the area and circumference of a circle.   
Sample Output:
Find the area and circumference of any circle :
----------------------------------------------------
Input the radius(1/2 of diameter) of a circle : 5
The area of the circle is : 78.5397
The circumference of the circle is : 31.4159
*/

import java.util.Scanner;
class CircleDemo1
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
              System.out.println("Find the  area of rectangle:");
              System.out.println("---------------\n");
      System.out.print("Enter the radius: ");
      double radius = sc.nextDouble();
      //Area = PI*radius*radius
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
      //Circumference = 2*PI*radius
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}
 

