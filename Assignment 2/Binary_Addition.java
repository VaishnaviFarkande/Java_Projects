/*60. Write a program in JAVA to add two binary numbers.   
Sample Output:
Addition of two binary numbers:
-----------------------------------
Input the 1st binary number: 1010
Input the 2nd binary number: 0011
The sum of two binary numbers is: 1101
 */


import java.util.Scanner;
public class Binary_Addition
{
 public static void main(String[] args)
 {
  long binary1, binary2;
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  Scanner in = new Scanner(System.in);

  System.out.print("Input the 1st binary number: ");
  binary1 = in.nextLong();
  System.out.print("Input the 2nd binary number: ");
  binary2 = in.nextLong();

  while (binary1 != 0 || binary2 != 0) 
  {
   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.print("The Sum of two binary numbers: ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}
