/*Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)*/

import java.util.Scanner;

public class Powerof 
{

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

System.out.println("ENTER THE NO. ");

int n1 = sc.nextInt ();

System.out.println("ENTER THE POWER FOR THAT NO.");

int n2 = sc.nextInt ();

int power = 1;

if (n2 >= 1) 
{

for (int i = 1; i <= n2; i++) 
{

power = power * n1;

}

System.out.println(power);
}
}
}