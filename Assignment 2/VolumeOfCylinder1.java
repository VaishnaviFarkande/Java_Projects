/*46. Write a program in JAVA to calculate the volume of a cylinder.   
Sample Output:
Calculate the volume of a cylinder :
-----------------------------------------
Input the radius of the cylinder : 4
Input the height of the cylinder : 8
The volume of a cylinder is : 401.92
*/

import java.util.Scanner;
class VolumeOfCylinder1 
{
   public static void main(String args[]) 
    {   
        
System.out.println("Calculate the volume of Cylinder:");
System.out.println("----------------\n");
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r=s.nextDouble();
         System.out.println("Enter the height:");
         double h=s.nextDouble();
 
            double  volume=((22*r*r*h)/7);
 
            System.out.println("volume of Cylinder is: " +volume);
       
 }
}


