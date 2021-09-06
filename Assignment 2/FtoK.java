/*26. Write a program in JAVA to convert temperature in Fahrenheit to Kelvin.  
*/

class FtoK
{

static float Fahrenheit_to_Kelvin( float F )
{

    return 273.5f + ((F - 32.0f) * (5.0f/9.0f));
}

public static void main(String arg[])
{

    float F = 100;
    System.out.println("Temperature in Fahrenheit: "+F);
    System.out.print("Temperature in Kelvin ( K ) = "

                    + (Math.round(Fahrenheit_to_Kelvin( F )*1000.0)/1000.0)) ;
}
}
