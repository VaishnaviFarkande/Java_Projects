/*Write a program in JAVA to display the operation of pre and post increment and decrement.   
Sample Output:
Display the operation of pre and post increment and decrement :
--------------------------------------------------------------------
The number is : 57
After post increment by 1 the number is : 58
After pre increment by 1 the number is : 59
After increasing by 1 the number is : 60
After post decrement by 1 the number is : 59
After pre decrement by 1 the number is : 58
*/

import java.util.Scanner;
public class Increment_Decrement
{
    public static void main(String[] args) 
    {
        int a, b, c,d;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer a:");
        a = s.nextInt();
        b =++a;
        System.out.println("After post increment by 1 the number is:"+a);
        System.out.println("After pre decrement by 1 the number is:"+b);
        c = ++a;
        System.out.println("After pre increment by 1 the number is:"+a);
        System.out.println("After post decrement by 1 the number is:"+c);
        d = ++a;
        System.out.println("After increasing by 1 the number is:"+a);
       
       
    }   
}
 
