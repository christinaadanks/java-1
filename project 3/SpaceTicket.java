import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

/**
 * Program that prints detailed ticket information from an inputted
 * ticket code, and generates a random prize number.
 *
 * @author Christinaa Danks
 * @version 9/2/2020
 */

public class SpaceTicket   {

   static final double STUDENT_DISCOUNT = .25;
   static final double CHILD_DISCOUNT = .35;
   
   /**
    * Process user inputted ticket code and print detailed ticket information.
    *
    * @param args Command line arguments (not used).
    *
    */
   public static void main(String[] args) {

      Scanner userInput = new Scanner(System.in);
      Random generator = new Random();
      
      String ticketCode1;
      String ticketCode2;
      char studentTicket = 's';
      char childTicket = 'c';
      
      // prompt user for for ticket code:
      System.out.print("Enter ticket code: ");
      ticketCode1 = userInput.nextLine();
      ticketCode2 = ticketCode1.trim();
      
      // display error message if code is less than 25 characters
      if (ticketCode2.length() < 25)   {
         System.out.println("*** Invalid ticket code ***");
         System.out.println("Ticket code must have at least 25 characters.");
      }
      else {
         // print space ticket description
         String ticketName = ticketCode2.substring(24);    
         System.out.println("\nSpace Ticket: " + ticketName);
         
         // print date, time, and seat
         String dateMonth = ticketCode2.substring(13, 15);
         String dateDay = ticketCode2.substring(15, 17);
         String dateYear = ticketCode2.substring(17, 21);
         System.out.print("Date: " + dateMonth + "/" + dateDay 
            + "/" + dateYear);
         
         String timeHour = ticketCode2.substring(9, 11);
         String timeMin = ticketCode2.substring(11, 13);
         System.out.print("   Time: " + timeHour + ":" + timeMin);
         
         String seat = ticketCode2.substring(21, 24);
         System.out.println("   Seat: " + seat);
         
         // print price, category, and cost      
         String ticketPrice = ticketCode2.substring(0, 8);
         double tp = Double.parseDouble(ticketPrice);
         double tp2 = tp / 100;
         DecimalFormat df = new DecimalFormat("$#,##0.00");      
         System.out.print("Price: " + df.format(tp2));
      
         char category = ticketCode2.charAt(8);
         System.out.print("   Category: " + category);
         double cost;
         
         if (category == studentTicket) {
            cost = tp2 - (tp2 * STUDENT_DISCOUNT);
         }
         else if (category == childTicket)   {
            cost = tp2 - (tp2 * CHILD_DISCOUNT);
         }
         else {
            cost = tp2;
         }
         System.out.println("   Cost: " + df.format(cost));
         
         // generate random prize number
         int prizeNum = generator.nextInt(999999) + 1;
         DecimalFormat pn = new DecimalFormat("000000");
         System.out.println("Prize Number: " + pn.format(prizeNum));
      
      }
      
   
   }

}