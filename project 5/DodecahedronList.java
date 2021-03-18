import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 * stores the name of the list and an ArrayList of objects.
 * @author Christinaa Danks
 * @version 9/17/2020
 */
public class DodecahedronList {

   // instance variables
   private String listName;
   private ArrayList<Dodecahedron> dodecaObj 
                = new ArrayList<Dodecahedron>();
   
   // constructor
   /**
    * @param listNameIn to determine name of list.
    * @param dodecaObjIn to determine list of objects.
    */
   public DodecahedronList(String listNameIn, 
                ArrayList<Dodecahedron> dodecaObjIn) {
      listName = listNameIn;
      dodecaObj = dodecaObjIn;
   }
   
   // methods
   /**
    * @return name of the list.
    */
   public String getName() {
      return listName;
   }
   
   /**
    * @return number of Dodecahedron objects in the list.
    */
   public int numberOfDodecahedrons()  {
      if (dodecaObj.size() == 0)   {
         return 0;
      }
      else  {
         return dodecaObj.size();
      }
   }
   /**
    * @return total surface area for objects in list.
    */
   public double totalSurfaceArea() {
      double totalSA = 0.0;
      int index = 0;
      if (dodecaObj.size() == 0)  {
         return 0.0;
      }
      while (index < dodecaObj.size())  {
         totalSA += dodecaObj.get(index).surfaceArea();
         index++;
      }
      return totalSA;
   }
   
   /**
    * @return total volumes for objects in list.
    */
   public double totalVolume()   {
      double totalV = 0.0;
      int index = 0;
      if (dodecaObj.size() == 0) {
         return 0.0;
      }
      while (index < dodecaObj.size())  {
         totalV += dodecaObj.get(index).volume();
         index++;
      }
      return totalV;
   }
   
   /**
    * @return average surface area for objects in list.
    */
   public double averageSurfaceArea() {
      double aveSA = 0.0;
      if (dodecaObj.size() == 0)  {
         return 0.0;
      }
      else  {
         aveSA = totalSurfaceArea() / dodecaObj.size();
      }
      return aveSA;
   }
   
   /**
    * @return average volume for objects in list.
    */
   public double averageVolume() {
      double aveV = 0.0;
      if (dodecaObj.size() == 0)  {
         return 0.0;
      }
      else  {
         aveV = totalVolume() / dodecaObj.size();
      }
      return aveV;
   }
   
   /**
    * @return average surface to volume ratio for objects in list.
    */
   public double averageSurfaceToVolumeRatio()  {
      double aveSToV = 0.0;
      int index = 0;
      while (index < dodecaObj.size()) {
         aveSToV += dodecaObj.get(index).surfaceToVolumeRatio();
         index++;
      }
      if (dodecaObj.size() != 0) {
         aveSToV = aveSToV / dodecaObj.size();
      }
      else  {
         return 0.0;
      }
      return aveSToV;
   }
   
   /**
    * @return name of list and each Dodecahedron in ArrayList.
    */
   public String toString()   {
      String totalList = listName + "\n";
      int index = 0;
      while (index < dodecaObj.size())  {
         totalList += "\n" + dodecaObj.get(index).toString() + "\n";
         index++;
      }
      return totalList;

   }
   
   /**
    * @return name of list and summary.
    */
   public String summaryInfo()   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String summary = "";
      summary += "----- Summary for " + getName() + " -----";
      summary += "\nNumber of Dodecahedrons: " + numberOfDodecahedrons();
      summary += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      summary += "\nTotal Volume: " + df.format(totalVolume());
      summary += "\nAverage Surface Area: " 
                  + df.format(averageSurfaceArea());
      summary += "\nAverage Volume: " + df.format(averageVolume());
      summary += "\nAverage Surface/Volume Ratio: " 
                  + df.format(averageSurfaceToVolumeRatio());
      return summary;
   }
   
   
   



}