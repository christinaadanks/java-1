import java.util.Scanner;
/** 
 * Program to calculate max heart rate based on the
 * user's age and gender.
 *
 * @author Christinaa Danks
 * @version 08/24/2020
 */
public class AgeStatistics   {
   /**
    * Display user input information and calculate age
    * conversion and max heart rate based on age and gender.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and "
            + "0 for male): ");
      gender = userInput.nextInt();
      
      //convert age:
      System.out.println("\tYour age in minutes is "
            + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
            + (double) ageInYears / 100 + " centuries.");
      
      //display max heart rate
      System.out.print("Your max heart rate is ");
      
      if (gender == 1)   {
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else  {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
      
   
   }
 
 
}