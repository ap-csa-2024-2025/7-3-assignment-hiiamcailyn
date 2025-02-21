import java.util.ArrayList;import java.util.Scanner;
public class Main{public static void main(String[] args)
{
  // ArrayList<String> dingtea = new ArrayList<String>();// dingtea.add("A");   
  // dingtea.add("B");  
  // dingtea.add("C");  
  // dingtea.add("D");  
  // dingtea.add("E"); 
  // dingtea.add("F");   
  // System.out.println("the list "+ dingtea);  
  // shiftLeft(dingtea);  
  // System.out.println("the list shift left "+dingtea);
// Part 2  
  ArrayList<Integer> dingteas = new ArrayList<Integer>();
  dingtea.add(2);
  dingtea.add(5);
  dingtea.add(7);
  dingtea.add(5);
 System.out.println("This is the list of boba teas" + dingteas);
  System.out.println("This is the stats of boba teas" + printStatics(dingteas));
 }
 public static void shiftLeft(ArrayList<String> arr)
  {
     System.out.println("ArrayList before doing anything" + arr);//Assume array has one element 
  String front = arr.remove(0);
   // this will shift everthing to the left  
   arr.add(front);
 }
 public static void printStatics(ArrayList<Integer> arr) 
 {
    int count = 0;
   int sum = 0;
   int mode = 0;
   int average = 0; 
   for (int i = 0; i < dingteas.size(); i++) 
     {
       sum += i;
      count ++; 
}
   System.out.println("Sum: " + sum);
   average = sum/ count; 
   System.out.println("Average: " + average);
   mode = sum % count;
   System.out.println("Mode: " + mode);
  }
    }
