/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.*/


public class ReverseDigits {
public static int reversDigits(int num)
{
int rev_num = 0;
while (num > 0) 
{
rev_num = rev_num * 10 + num % 10;
num = num / 10;
}
return rev_num;
}
public static void main(String[] args)
{
int num = 12345;
System.out.println("Reverse of no. is "
						+ reversDigits(num));
}
}
