/*57. Write a program in JAVA to print the area of a hexagon.   
Sample Output:
Print the area of a hexagon:
---------------------------------
Input the side of the hexagon: 6
The area of the hexagon is: 93.5307
*/


import java.util.Scanner;
public class Area_Hexagon {

 public static void main(String[] args) {
 System.out.println("Print the area of a hexagon:");
 System.out.println("---------------------------------");
  Scanner cs=new Scanner(System.in);
  System.out.println("Input the side of the hexagon: ");
     int a=cs.nextInt();
     double area=(3*Math.sqrt(3)*Math.pow(a,2))/2.0;
     System.out.println("The area of the hexagon is: "+area);
  cs.close();
 }
}