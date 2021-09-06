/*50. Write a program in JAVA to enter length in centimeter and convert it into meter and kilometer.   
Sample Output:
Convert centimeter into meter and kilometer :
--------------------------------------------------
Input the distance in centimeter : 250000
The distance in meter is: 2500
 2.5
*/

import java.io.*;
public class Centimeterintokm
{
public static void main (String[] args)
{
System.out.println("Convert centimeter into meter and kilometer :");
System.out.println("--------------------------------------------------");
double cm, meter, kilometer;
cm = 1000;
meter = cm / 100.0;
kilometer = cm / 100000.0;
System.out.println("Input the distance in centimeter :");
System.out.println("The distance in meter is: " +meter + "m");
System.out.println("The distance in meter is: " + kilometer + "km");
}
}

