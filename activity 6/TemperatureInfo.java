import java.util.Scanner;
import java.util.ArrayList;

/**
 * Program that allows users to ineract with Temperatures class.
 * @author Christina L
 * @version 9/23/2020
 */
 
public class TemperatureInfo  {

   /**
    * Reads in user input data.
    * Prints data based on menu choice.
    *
    * @param args Command line arguments - not used.
    */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
            
         }
      }  while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, "
                     + "[H]igh Temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         
         switch (choice)   {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            
            case 'P':
               System.out.println(temps);
               break;
            
            case'E':
               System.out.println("\tDone");
               break;
            
            default:
               System.out.println("\tInvalid choice!");
         }
      }  while (choice != 'E');
      
      
   }
   
}
