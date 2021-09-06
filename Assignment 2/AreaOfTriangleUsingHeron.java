/*47. Write a program in JAVA to find the area of any triangle using Heron's Formula.   
Sample Output:
Find the area of any triangle using Heron's Formula :
----------------------------------------------------------
Input the length of 1st side of the triangle : 5
Input the length of 2nd side of the triangle : 6
Input the length of 3rd side of the triangle : 7
The area of the triangle is : 14.6969
*/

import java.util.Scanner;
public class AreaOfTriangleUsingHeron {
 
    public static void main(String[] args) {
        System.out.println("Find the  area of rectangle:");
        System.out.println("-------------------\n");
        double s1, s2, s3, area, S;
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.println("Enter the first Side of a Triangle:");
        s1 = scanner.nextDouble();
          System.out.println("Enter the second Side of a Triangle:");
        s2 = scanner.nextDouble();
          System.out.println("Enter the third Side of a Triangle:");
        s3 = scanner.nextDouble();
        S = (s1 + s2 + s3) / 2;
        area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
  System.out.format("The Area of triangle = %.2f\n", area);
    }
}
 


