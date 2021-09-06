/*20. Write a program in JAVA to convert temperature in Celsius to Fahrenheit.   
Sample Output:
Convert temperature in Celsius to Fahrenheit :
---------------------------------------------------
Input the temperature in Celsius : 35
The temperature in Celsius : 35
The temperature in Fahrenheit : 95
*/

import java.util.Scanner;
class Celsius_to_Fahrenheit_1
{
 public static void main(String[] args)
{
     System.out.println("Convert temperature in celcius to Fahrenheit");
     System.out.println("---------------\n");
 float cel, far;

Scanner s=new Scanner(System.in);
System.out.println("Enter temp. in Celsius :");
cel=s.nextInt();
System.out.println("Temp. in celcius: "+cel);

far = cel * 9/5 + 32;

System.out.println("Temp. in Fahrenheit: "+far);
}
}
 