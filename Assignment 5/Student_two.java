/*2.Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.*/


public class Student_two
{
    int  rollsam=101;
    int rolljohn=102;
    long phonenosam=956192584L;
    long phonenojohn=658932146L;
    String adrrsam="Latur";
    String addrjohn="Chakur";
   public static void main(String[] args)
    {
       Student_two sam=new Student_two();
       Student_two john=new Student_two();
       System.out.println( sam.rollsam);
       System.out.println(john.rolljohn);
       System.out.println(sam.phonenosam);
       System.out.println(john.phonenojohn);
       System.out.println(sam.adrrsam);
       System.out.println(john.addrjohn);
    }
}
