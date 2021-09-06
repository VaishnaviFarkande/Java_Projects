/*7.Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
*/

import java.util.Scanner;
public class AreaOF
{
    int length,breadth;
  public AreaOF(int l,int b)
  {
       length=l;
       breadth=b;
   }
  public int getArea()
  {
        return length*breadth;
  }
  
  public static void main(String[] args)
  {
     int l,b;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter length"); 
     l=s.nextInt();
     System.out.println("Enter breadth");
     b=s.nextInt();
     AreaOF a=new AreaOF(l,b);
    System.out.println("Area is :"+a.getArea());
  }
}  
 
