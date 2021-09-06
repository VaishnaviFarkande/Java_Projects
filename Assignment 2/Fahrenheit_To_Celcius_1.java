/*21. Write a program in JAVA to convert temperature in Fahrenheit to Celsius.   
Sample Output:
Convert temperature in Fahrenheit to Celsius :
---------------------------------------------------
Input the temperature in Fahrenheit : 95
The temperature in Fahrenheit : 95
The temperature in Celsius : 35
 */
 
import java.util.Scanner;
class Fahrenheit_To_Celcius_1
{
 public static void main(String[] args)
{
     System.out.println("Convert temperature in Fahrenheit to Celcius");
     System.out.println("...........\n");
 float far,cel;

Scanner s=new Scanner(System.in);
System.out.println("Enter temp. in Fahrenheit :");
far=s.nextInt();
System.out.println("Temp. in Fahrenheit: "+far);
cel = ((far-32)*5)/9;
System.out.println("Temp. in Celcius: "+cel);
}
}

