/*44. Write a language program to get the volume of a sphere with radius 5.   
Sample Output:
Calculate the volume of a sphere :
---------------------------------------
Input the radius of a sphere : 5
The volume of a sphere is : 523.333
*/

public class sphere{  
        public static void main(String args[])  
    {  
    System.out.println("Calculate the volume of a sphere :");
    System.out.println("-------------------\n");
    int radius=5;  
    double pie=3.14285714286;  
    double volume=(4.0/3.0)/(radius*radius*radius);
    System.out.println("Volume of the sphere="+volume);  
     }  
}
 