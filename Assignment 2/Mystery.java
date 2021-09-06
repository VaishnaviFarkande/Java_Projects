/*37. Write a program in JAVA to print a mystery series from 1 to 50.   
Sample Output:
Print a mystery series:
-------------------------
The series are:
5 4 2 7 11 10 8 13 17 16 14 19 23 22 20 25 29 28 26 31 35 34 32 37 41 4 0 38 43 47 46 44 49
*/

 public class Mystery  {
  public static void main(String[] args) {
 System.out.println("\n\n Print a mystery series:\n");
 System.out.println("-------------------------\n");
	 System.out.println(" The series are: \n");	
   int nm1 = 1;
   while (true) 
   {
      ++nm1;
      if ((nm1 % 3) == 0) 
      continue;
      if (nm1 == 50) 
      break;
      if ((nm1 % 2) == 0) 
      {
         nm1 += 3;
      } 
      else 
      {
         nm1 -= 3;
      }
     System.out.println(nm1 + " ");
   }
}
}
 

