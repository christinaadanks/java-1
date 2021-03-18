import java.util.Scanner;
/** 
 * Program to calculate the results for the inputted values
 * of x, y, and z into a formula.
 *
 * @author Christinaa Danks
 * @version 08/24/2020
 */
public class FormulaCalculator {
   /**
   * Calculates result of formula for the inputted
   * x, y, and z values.
   *
   * @param args Command line arguments (not used).
   */

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      double zeroResult = 0;
      double formulaTop = 0;
      double formulaBottom = 0;
      
      System.out.println("result = (2x - 7.4) (4y + 9.3) (6z - 11.2) / xyz");
      
      //prompt user for x, y, z values:
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      
      //calculates for results for denominations of 0.
      if (x == 0 || y == 0 || z == 0) {
         System.out.println("result = " + zeroResult);     
      }
      
      //calculates formula result.
      else  {
         formulaTop = (2 * x - 7.4) * (4 * y + 9.3) * (6 * z - 11.2);
         formulaBottom = x * y * z;
         System.out.println("result = " + formulaTop / formulaBottom);
         
      
      }
      
   
   }

}
