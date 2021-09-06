/*8. Write a program in JAVA to check overflow/underflow during various arithmetical operation.   
Sample Output:
Check overflow/underflow during various arithmetical operation :
Range of int is [-2147483648, 2147483647]
---------------------------------------------------------------------
Underflow the range and set in maximum range : 2147483647
Decreasing from its maximum range : 2147483646*/


public class OverflowUnderflow {
public static void main(String args[]){
 	System.out.println("Check overflow/underflow during various arithmetical operation :");
 	System.out.println("Range of int is [-2147483648, 2147483647] " );
System.out.println("...................\n");
 //roll over effect to lower limit in overflow
 int overflowExample = 2147483647;
 System.out.println("Overflow: "+ (overflowExample + 1));
//roll over effect to upper limit in underflow
 int underflowExample = -2147483648;
 System.out.println("Underflow: "+ (underflowExample - 1));
 }
}
