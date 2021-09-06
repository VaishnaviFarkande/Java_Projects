/*6.Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/

public class Area
{

int length,breadth;
Area(int l, int b){
        length = l;
        breadth = b;
}
public int setDim(){
int results = length * breadth;
return results;
}
 public void getArea(){
System.out.println("Area = " +  setDim());
}
public static void main(String []args){
Area x =new Area(12,5);
x.getArea();
    
}
}