// Fig. 4.12: Analysis.java
// Analysis of examination results using nested control statements. 
import java.util.Scanner;

public class Analysis 
{
   public static void main(String[] args) 
   {
      
      Scanner input = new Scanner(System.in);

      // initializing variables in declarations
      int passes = 0; 
      int failures = 0;
      int studentCounter = 1; 

      // process 10 students using counter-controlled loop
      while (studentCounter <= 10) 
      {
         // promp user for input and obtain value from user
         System.out.print("Enter result (1 = pass, 2 = fail): ");
         int result = input.nextInt();

         // if...else commands           
         if (result == 1)         
            passes = passes + 1;   
         else                        
            failures = failures + 1; 

         // increment studentCounter so loop eventually terminates
         studentCounter = studentCounter + 1;  
      } 

      
      System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

      // determine whether more than 8 students passed
      if (passes > 8)
         System.out.println("Bonus to instructor!");
   } 
} // end class 
