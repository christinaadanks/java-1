/**
 * NumberOperations class that stores the label, color, and edge.
 *
 * @author Christinaa Danks
 * @version 9/15/2020
 */

public class NumberOperations {
   // instance variables
   private int number;
   
   // constructor
   /**
    * comment here.
    * @param numberIn to determine value of number.
    */
   public NumberOperations(int numberIn)  {
      number = numberIn;
   }
   
   // methods
   /**
    * gets value of number.
    * @return value of number.
    */
   public int getValue()   {
   
      return number;
   }
   
   /**
    * @return value of output.
    */
   public String oddsUnder()  {
      String output = "";
      int i = 0;
      while (i < number)   {
         if (i % 2 != 0) {
            output += i + "\t";         
         }
         i++;
      
      }
      return output;
   }
   
   /**
    * @return value of output.
    */
   public String powersTwoUnder()   {
      String output = "";
      int powers = 1;
      while (powers < number)  {
         output += powers + "\t"; //concatenate to output
         powers = powers * 2; // get next power of 2
      }
      return output;
   }
   
   /**
    * @return 0, -1, or 1.
    * @param compareNumber to compare two integers.
    */
   public int isGreater(int compareNumber) {
   
      if (number > compareNumber)   {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else  {
         return 0;
      }
   
   }
   
   /**
    * @return number.
    */
   public String toString()   {
   
      return number + "";
   
   }


}