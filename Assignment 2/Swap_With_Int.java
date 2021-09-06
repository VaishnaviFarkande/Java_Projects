/*48. Write a program in JAVA which swap the values of two variables not using third variable.   
Sample Output:
Swap two numbers without using third variable:
---------------------------------------------------
Input 1st number : 25
Input 2nd number : 20
After swapping the 1st number is : 20
After swapping the 2nd number is : 25
*/

 import java.util.*;  
class Swap_With_Int {  
    public static void main(String[] args) {  
    System.out.println("Swap two nums:");
       int x, y, t;// x and y are to swap   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X");  
       x = sc.nextInt();  
       System.out.println("Enter the value of Y"); 
       y = sc.nextInt();  
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping 1st number is: "+x +"   " );  
      System.out.println("After swapping 2nd number is: "+y +"   " );   
       System.out.println( );  
    }    
}