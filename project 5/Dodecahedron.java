import java.text.DecimalFormat;
/**
 * Dodecahedron class that stores the label, color, and edge.
 *
 * @author Christinaa Danks
 * @version 9/8/2020
 */
 
public class Dodecahedron {
   // instance variables
   private String label = "";
   private String color = "";
   private double edge = 0.0;
   
   // constructors
   /**
    * @param labelIn to determine label.
    * @param colorIn to determine color.
    * @param edgeIn to determine edge.
    */
   public Dodecahedron(String labelIn, String colorIn, double edgeIn)   {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
   
   /**
    * gets dodecahedron label.
    * @return dodecahedron label.
    */
   public String getLabel()   {
      return label;
   }
   
   /**
    * changes dodecahedron label.
    * @param labelIn is the new label.
    * @return a new label.
    */
   public boolean setLabel(String labelIn)  {
      boolean isSetLabel = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSetLabel = true;
      }
      return isSetLabel;
   }
   
   /**
    * gets dodecahedron color.
    * @return dodecahedron color.
    */
   public String getColor()   {
      return color;
   }
   
   /**
    * changes dodecahedron color.
    * @param colorIn is the new color.
    * @return a new color.
    */
   public boolean setColor(String colorIn)   {
      boolean isSetColor = false;
      if (colorIn != null) {
         color = colorIn.trim();
         isSetColor = true;
      }
      return isSetColor;
   }
   
   /**
    * gets dodecahedron edge.
    * @return dodecahedron edge.
    */
   public double getEdge() {
      return edge;
   }
   
   /**
    * changes dodecahedron edge.
    * @param edgeIn is the new edge.
    * @return a new edge.
    */
   public boolean setEdge(double edgeIn)  {
      boolean isSetEdge = false;
      if (edgeIn > 0)   {
         edge = edgeIn;
         isSetEdge = true;
      }
      return isSetEdge;
   }
   
   /**
    * method to calculate surface area.
    * @return total surface area of dodecahedron.
    */
   public double surfaceArea()   {
      double total = 3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(edge, 2);
      return total;
   }
 
   /**
    * method to calculate volume.
    * @return dodecahedron volume.
    */
   public double volume()  {
      double dodecaVolume = ((15 + 7 * Math.sqrt(5)) / 4) * Math.pow(edge, 3);
      return dodecaVolume;
   }
   
   /**
    * method to calculate the surface area to volume ratio.
    * @return surface area to volume ratio.
    */
   public double surfaceToVolumeRatio()   {
      double ratio = surfaceArea() / volume();
      return ratio;
   }
   
   /**
    * method to return a string representation of the object.
    * @return String representing dodecahedron objects.
    */
   public String toString()   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "Dodecahedron \"" + label + "\" is \""
         + color + "\" with 30 edges of length " + edge + " units.\n";
      output += "\tsurface area = " + df.format(surfaceArea())
         + " square units\n";
      output += "\tvolume = " + df.format(volume()) + " cubic units\n";
      output += "\tsurface/volume ratio = " + df.format(surfaceToVolumeRatio());
         
      return output;
   }
}