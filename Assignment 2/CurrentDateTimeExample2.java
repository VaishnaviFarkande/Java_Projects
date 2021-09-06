/*34. Write a JAVA program to display the current date and time.   
Sample Output:
Display the Current Date and Time :
----------------------------------------
*/

 import java.text.SimpleDateFormat;  
import java.util.Date;  
public class CurrentDateTimeExample2 {  
public static void main(String[] args) {  
System.out.println("Display the Current Date and Time :");
System.out.println("--------------------\n");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    System.out.println(formatter.format(date));  
}  
}
