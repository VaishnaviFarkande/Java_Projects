/*53. Write a program in JAVA to calculate area of an equilateral triangle.   
Sample Output:
Calculate the area of the Equilateral Triangle :
Input the value of the side of the equilateral triangle: 5
The area of equilateral triangle is: 10.8253
*/


import java.util.Scanner;
class AreaOfEquilateralTriangle 
{
   public static void main(String args[]) 
    {   
       
          Scanner s= new Scanner(System.in);
          System.out.println("Input the value of the side of the equilateral triangle:");
          double a= s.nextDouble();
          double  area=(Math.sqrt(3)/4)*(a*a);
          System.out.println("The area of equilateral triangle is: " + area);      
     }
}