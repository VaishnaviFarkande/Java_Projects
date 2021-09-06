/*29. Write a program in JAVA to compute quotient and remainder.   
Sample Output:
Compute quotient and remainder :
-------------------------------------
Input the dividend : 25
Input the divisor : 3
The quotient of the division is : 8
The remainder of the division is : 1
*/

 import java.util.Scanner;
public class Division {
 public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
       System.out.print("Input the dividend: ");     
    int dividend = reader.nextInt();
        System.out.print("Input the divisor: ");   
 int divisor = reader.nextInt();
      int quotient = dividend / divisor;
        int remainder = dividend % divisor;
   String output2 = String.format("Quotient = %d \nRemainder =%d ",quotient,remainder);
    System.out.println(output2);
    }   
}
 
