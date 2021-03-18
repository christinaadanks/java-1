import java.util.Scanner;
/** 
 * Program to calculate the minimum number of each paper currency
 * denominations for an inputted dollar amount.
 *
 * @author Christinaa Danks
 * @version 08/24/2020
 */
public class ATM {
   /**
   * Calculates minimum number of currency denominations. 
   *
   * @param args Command line arguments (not used).
   */   
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      int dollarAmount = 0;
      int twentyDollars = 0;
      int tenDollars = 0;
      int fiveDollars = 0;
      int oneDollar = 0;
      
      
      //prompt the user for dollar amount:
      System.out.print("Enter the amount: ");
      dollarAmount = userInput.nextInt();
      
      //calculates and prints the denominations.
      if (dollarAmount <= 500)   {
         System.out.println("Bills by denomination: ");
         
         twentyDollars = dollarAmount / 20;
         System.out.println("\t$20: " + twentyDollars);
         
         tenDollars = dollarAmount % 20 / 10;
         System.out.println("\t$10: " + tenDollars);
         
         fiveDollars = dollarAmount % 20 % 10 / 5;
         System.out.println("\t$5: " + fiveDollars);
         
         oneDollar = dollarAmount % 20 % 10 % 5 / 1;
         System.out.println("\t$1: " + oneDollar);
         
         System.out.print("$" + dollarAmount);
         System.out.print(" = " + "(" + twentyDollars + " * $20) ");
         System.out.print("+ " + "(" + tenDollars + " * $10) ");
         System.out.print("+ " + "(" + fiveDollars + " * $5) ");
         System.out.print("+ " + "(" + oneDollar + " * $1) ");
      }
      
      //prints statement for dollar amounts exceeding 500.
      else  {
         System.out.println("Limit of $500 exceeded!");
      
      }
   }
 
}