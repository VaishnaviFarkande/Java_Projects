/*22. Write a program in JAVA to find the third angle of a triangle.   
Sample Output:
Find the third angle of a triangle :
-----------------------------------------
Input the 1st angle of the triangle : 30
Input the 2nd angle of the triangle : 60
The 3rd of the triangle is : 90
*/

import java.util.Scanner;
class Test
{
public static void main(String args[])
{
    int a, b, c;
    Scanner op=new Scanner(System.in);
    /* Input two angles of the triangle */
    System.out.print("Enter First angles of triangle: ");
    a=op.nextInt();
    System.out.print("Enter Second angles of triangle: ");
    b=op.nextInt();;

    /* Compute third angle */
    c = 180 - (a + b);

    /* Print value of the third angle */
    System.out.println("Third angle of the triangle = "+c);
}
}