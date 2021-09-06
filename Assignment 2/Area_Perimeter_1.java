/*40. Write a program in JAVA to print the area and perimeter of a rectangle.   
Sample Output:
Print the area and perimeter of a rectangle:
----------------------------------------------
Input the width of the rectangle: 8
Input the height of the rectangle: 5
The area of the rectangle is: 40
The perimeter of the rectangle is: 26
*/

import java.util.Scanner;
public class Area_Perimeter_1
{
    public static void main(String[] args) 
    {
        int l, b, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Input the width of the rectangle:");
        l = s.nextInt();
        System.out.print("Input the height of the rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        System.out.println("The Perimeter of rectangle:"+perimeter);
        area = l * b;
        System.out.println("The Area of rectangle:"+area);
    }
}
 
