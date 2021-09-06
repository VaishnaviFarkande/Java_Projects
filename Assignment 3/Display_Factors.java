/*Java Program to Display Factors of a Number*/

public class  Display_Factors{
public static void main(String[] args) {
int number = 20;
System.out.print("Factors of " + number + " are: ");
for (int i = 1; i <= number; ++i) {
if (number % i == 0) {
System.out.print(i + " ");
}
}
}
}