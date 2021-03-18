import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
/**
 * stores the name of the list and an ArrayList of objects.
 * @author Christinaa Danks
 * @version 9/26/2020
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

   
   /**
    * @return the ArrayList of Dodecahedrn objects.
    */
   public ArrayList<Dodecahedron> getList()  {
   
      return dodecaObj;
   }
   
   /**
    * @param fileName to read in.
    * @return the new list from the read in file.
    * @throws IOException if no file is found.
    */
   public DodecahedronList readFile(String fileName) throws IOException {
      Scanner scanFile = new Scanner(new File(fileName));
      ArrayList<Dodecahedron> newList = new ArrayList<Dodecahedron>();
      
      String newListName = "";
      String label = "";      
      String color = "";
      double edge = 0.0;
      
      newListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         
         Dodecahedron newObj  = new Dodecahedron(label, color, edge);
         dodecaObj.add(newObj);   
      }
      
      DodecahedronList dL = new DodecahedronList(newListName, dodecaObj);
      return dL;
      
   }
   
   /**
    * @param labelIn takes and adds the user input label.
    * @param colorIn takes and adds the user input color.
    * @param edgeIn takes and adds the user input edge.
    */
   public void addDodecahedron(String labelIn, 
                     String colorIn, double edgeIn)   {
      Dodecahedron newObj = new Dodecahedron(labelIn, colorIn, edgeIn);
      dodecaObj.add(newObj);
      
   }
   
   /**
    * @param labelIn used to find the object from list.
    * @return if object was found or not.
    */
   public Dodecahedron findDodecahedron(String labelIn)  {
      for (Dodecahedron newObj : dodecaObj)  {
         if (newObj.getLabel().equalsIgnoreCase(labelIn))  {
            return newObj;
         }
      }
      return null;
   }
   
   /**
    * @param labelIn used to delete object from list.
    * @return if deletion was successful.
    */
   public Dodecahedron deleteDodecahedron(String labelIn)   {
      int index = dodecaObj.indexOf(findDodecahedron(labelIn));
      
      if (index >= 0)   {
         return dodecaObj.remove(index);
         
      }
      return null;
   
   }
      
   /**
    * @param labelIn used to find object from list.
    * @param colorIn used to edit the color from list.
    * @param edgeIn used to edit edge from list.
    * @return if edit was successful.
    */
   public boolean editDodecahedron(String labelIn, 
                           String colorIn, double edgeIn)  {
      boolean result = false;
      for (Dodecahedron newObj : dodecaObj)  {
         if (newObj.getLabel().equalsIgnoreCase(labelIn)) {
            newObj.setColor(colorIn);
            newObj.setEdge(edgeIn);
            result = true;
            break;
         }
      }
      return result;
   }
   



}
