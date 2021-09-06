/*25. Write a program in JAVA to convert temperature in Kelvin to Celsius.   
*/

import java.io.*;
 class ABC {
 static float Celsius_to_Kelvin(float C)
 {
 return (float)(C + 273.15);
  }
     public static void main (String[] args) 
 {
   float C = 100;
   System.out.println("Temperature in Celcius:"+C);
 System .out.println ( "Temperature in Kelvin ( K ) = " + Celsius_to_Kelvin(C));
}
}
