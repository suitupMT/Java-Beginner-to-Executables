//import scanner function
import java.util.Scanner;
// project example for using math and user input, more explanations going forward
class GradeCalculator1 {
 //main method
  public static void main(String[] args) {
   //create scanner
   Scanner input = new Scanner(System.in);
   int grade1; //first grade
   int grade2; // second grade
   int total;//total points possible
   double percentage; //final grade
   int sum; //sum of the two grades together
   System.out.print("How many points did you get for Assignment1 of 10 possible?"); //prompt user
   grade1 = input.nextInt();//reads in first grade

   System.out.print("How many points did you get for Assignment2 of 10 possible?"); //prompt user
   grade2 = input.nextInt();//reads in next grade
   
   sum = grade1 + grade2; //adding two grades
   total = 20;
   percentage = (((double)sum)/((double)total))*100; //calculates percentage  
   //double type casting used on individual integer types

   System.out.printf("You currently have a %.0f", percentage);// float format 0 decimals
   System.out.print("% in CIS385");//prints out final grade
    
  }
}