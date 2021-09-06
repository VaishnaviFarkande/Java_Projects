/*13. Write a program in JAVA to swap two numbers.   
Sample Output:
Swap two numbers :
-----------------------
Input 1st number : 25
Input 2nd number : 39
After swapping the 1st number is : 39
After swapping the 2nd number is : 25
 */
 

import java.util.*;  
class Swap_With_2 {  
    public static void main(String[] args) {  
    System.out.println("Swap two nums:");
       int x, y, t;// x and y are to swap   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X");  
       x = sc.nextInt();  
       System.out.println("Enter the value of Y"); 
       y = sc.nextInt();  
       
       /*swapping */  
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +"   " );  
      System.out.println("After swapping: "+y +"   " );   
       System.out.println( );  
    }    
}