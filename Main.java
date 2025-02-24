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
  dingteas.add(2);
  dingteas.add(5);
  dingteas.add(7);
  dingteas.add(5);
 System.out.println("This is the list of boba teas" + dingteas);
  System.out.println("This is the stats of boba teas " + printStatics(dingteas));
 }
 public static void shiftLeft(ArrayList<String> arr)
  {
     System.out.println("ArrayList before doing anything" + arr);//Assume array has one element 
  String front = arr.remove(0);
   // this will shift everthing to the left  
   arr.add(front);
 }
 
 public static int printStatics(ArrayList<Integer> arr) 
 {
  int sum = 0;
        int mode = arr.get(0); // Initialize mode to the first element
        int maxCount = 0;

        // Calculate sum and find mode
        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            sum += value;

            // Count occurrences of the current value
            int count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) == value) {
                    count++;
                }
            }

            // Check if the current value is the new mode
            if (count > maxCount) {
                maxCount = count;
                mode = value;
            }
        }

        // Calculate average
        int average = sum / arr.size();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Mode: " + mode);

        return sum; // Return sum or any other desired integer
    }
 }

