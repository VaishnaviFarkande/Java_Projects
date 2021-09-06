/*Write a program in java to calculate the volume of a cube.   
Sample Output:
Calculate the volume of a cube :
---------------------------------------
Input the side of a cube : 5
The volume of a cube is : 125
*/

import java.util.Scanner;
class VolumeOfCube 
{
public static void main(String args[]) 
    {   
System.out.println("Calculate the volume of cube:");
System.out.println("----------------\n");

            Scanner s= new Scanner(System.in);
        
            System.out.println("Enter the side of cube:");
            double side=s.nextDouble();
            double  volume=side*side*side;
            System.out.println("volume of Cube is: " +volume);
 }
}