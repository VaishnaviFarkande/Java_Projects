/*52. Write a program in JAVA to enter two angles of a triangle and find the third angle.   
Sample Output:
Find the third angle of a triangle :
-----------------------------------------
Input the 1st angle of the triangle : 35
Input the 2nd angle of the triangle : 35
The 3rd of the triangle is : 110
*/


import java.util.Scanner;

public class Angle {

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
        System.out.println("Find the third angle of a triangle :");
        System.out.println("-----------------------------------------");
        System.out.println("Enter the 1st angle of triangle::\n");
        int p = in.nextInt();
        System.out.println("Enter the 2nd angle of triangle::\n");
        int q = in.nextInt();
        int r;
        // p, q, and r is all angles of the triangle
        r = 180 - (p + q);
       System.out.println("\nThird angle of the triangle = " + r + "\n");
    }
}