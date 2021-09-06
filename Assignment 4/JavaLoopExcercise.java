/*Write a program to find the factorial value of any number entered through the keyboard*/

import java.util.Scanner;
 
public class JavaLoopExcercise
{
public static void main(String[] args)
{
Scanner console = new Scanner(System.in);
int num; 
int fact = 1; 
System.out.print("Enter any positive integer: ");
num = console.nextInt();
for(int i=1; i<=num; i++)
{
fact *= i;
}
System.out.println("Factorial: "+ fact);
}
}