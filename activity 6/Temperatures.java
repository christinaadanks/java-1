import java.util.ArrayList;

/**
 *
 * @author Christina L
 * @version 9/23/2020
 */

public class Temperatures  {

   // instance variable.
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
   // constructor.
   /**
    * @param temperaturesIn for temperatures.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn)   {
      temperatures = temperaturesIn;
   }
   
   // methods.
   /**
    * @return lowest temperature from list.
    */
   public int getLowTemp()  {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)  {
         if (temperatures.get(i) < low)   {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   /**
    * @return highest temperature from list.
    */
   public int getHighTemp()   {
      if (temperatures.isEmpty())   {
         return 0;
      }
      
      int high = temperatures.get(0);
      for (Integer temp : temperatures)   {
         if (temp > high)   {
            high = temp;
         }
      }
      return high;
   }
   
   /**
    * @param lowIn for new low temperature.
    * @return parameter if it is lower than getLowTemp.
    */
   public int lowerMinimum(int lowIn)  {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   } 
   /**
    * @param highIn for new high temperature.
    * @return parameter if it is higher than getHighTemp.
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
    * @return temperatures and highest and lowest temps.
    */
   public String toString()   {
      return "\tTemperatures: " + temperatures
            + "\n\tLow: " + getLowTemp()
            + "\n\tHigh: " + getHighTemp();
   }
   
}
