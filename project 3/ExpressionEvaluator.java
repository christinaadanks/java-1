import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Program to calculate a mathematical expression and format the result.
 *
 * @author Christinaa Danks
 * @version 9/2/2020
 */
public class ExpressionEvaluator {

   /**
    * Calculate the expression with user inputted value of x and format
    * the result.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x;
      double result = 0;
      double expTop, expAbs, expBottom;
      
      // prompt user for x value:
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble(); 
      
      // calculate result
      expTop = Math.pow(3 * Math.pow(x, 5) - 2 * Math.pow(x, 3), 2);
      expAbs = Math.abs(16 * Math.pow(x, 7));
      expBottom = Math.sqrt(expAbs) + 1;
      result = expTop / expBottom;
      // print result
      System.out.println("Result: " + result);
      
      // determine number of digits to left and right of decimal
      String strResult = Double.toString(result);
      Integer leftDec = strResult.indexOf(".");
      Integer rightDec = strResult.length() - (1 + leftDec);
      
      System.out.println("# digits to left of decimal point: " + leftDec);
      System.out.println("# digits to right of decimal point: " + rightDec);
      
      // format result
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      System.out.print("Formatted Result: " + df.format(result));
   
   }


}