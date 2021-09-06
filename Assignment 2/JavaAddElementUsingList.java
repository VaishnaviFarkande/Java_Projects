/*Write a program in JAVA to add two numbers accept through keyboard.   
Sample Output:
Original array:
[10, 20, 30]
After append values to the end of the array:
[10 20 30 40 50 60 70 80 90]
 */
 
import java.util.ArrayList;  
import java.util.Arrays;  
public class JavaAddElementUsingList {  
public static void main(String[] args) {  
Integer arr[] = {10,20,30};  
System.out.println("Original Array:"+Arrays.toString(arr));  
ArrayList<Integer> arrayList = new 
ArrayList<Integer>(Arrays.asList(arr));  
arrayList.add(40);  
arrayList.add(50);  
arrayList.add(60);  
arrayList.add(70);  
arrayList.add(80);  
arr = arrayList.toArray(arr);  
System.out.println("Array after adding element: "+Arrays.toString(arr));  
 }  
}
