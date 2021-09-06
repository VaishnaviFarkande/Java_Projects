/*Write a program in JAVA to find Size of fundamental data types.*/

import java.util.*;
class SizeofdataTypes
{
 public static void main (String[] args)
 {
  System.out.println("The Size of int: " + (Integer.SIZE/8) + " bytes.");
  System.out.println("The Size of long: " + (Long.SIZE/8) + " bytes.");
  System.out.println("The Size of char: " + (Character.SIZE/8) + " bytes.");
  System.out.println("The Size of float: " + (Float.SIZE/8) + " bytes.");
  System.out.println("The Size of double: " + (Double.SIZE/8) + " bytes.");
  }
}