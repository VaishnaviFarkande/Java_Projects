/*23. Write a program in JAVA that converts kilometers per hour to miles per hour.   
*/

import java.util.Scanner;

public class MathUnitConversions6 {

	public static void main(String[] args) {
		System.out.println("Convert kilometers per hour to miles per hour:");

		double kilometers;

		System.out.println("Input the distance in kilometer:");

		Scanner in = new Scanner(System.in);
		kilometers = in.nextDouble();

		double miles = kilometers / 1.6;

		System.out.println(miles + " Miles");

	}
}


