/*1.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/


public class Student
{
 int rollno=2;
 String name="John";
 public static void main(String[] args)
 {
  Student stud1=new Student();
  System.out.println(stud1.name);
  System.out.println(stud1.rollno);
 }
}		