/*33. Write a program in JAVA to divide two numbers and print on the screen.   
Sample Output:
Divide two numbers and print:
----------------------------------
The quotient of a and b is : 3
*/

  import java.util.Scanner;

public class Divide {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.println("Input the first number: ");
    int a = input.nextInt();
 System.out.println("Input the second number: ");
    int b = input.nextInt();
    int d = (a/b);
    System.out.println();
    System.out.println("The division of a and b is:" +d);
  }
}