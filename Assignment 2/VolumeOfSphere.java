/*14. Write a program in JAVA to calculate the volume of a sphere.   
Sample Output:
Calculate the volume of a sphere :
---------------------------------------
Input the radius of a sphere : 6
The volume of a sphere is : 904.32
 */
 
 import java.util.Scanner;
class VolumeOfSphere 
{
      
   public static void main(String args[]) 
    {   
    System.out.println("Calculate the volume of sphere:");
System.out.println(".............\n");     
	
            	Scanner s= new Scanner(System.in);
         	System.out.println("Enter the radius of sphere:");
         	double r=s.nextDouble();
                
	
       
                 double  volume= (4*22*r*r*r)/(3*7);
 
             System.out.println("Volume is: sphere is:" +volume);
      }
}
