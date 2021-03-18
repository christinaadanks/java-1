/**
 * Dodecahedron class that stores the label, color, and edge.
 *
 * @author Christinaa Danks
 * @version 9/8/2020
 */
 
public class DodecahedronSkeleton {
   // instance variables
   private String label = "";
   private String color = "";
   private double edge = 0.0;
   
   // constructors
   public DodecahedronSkeleton(String labelIn, String colorIn, 
      double edgeIn)   {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
   
   // methods
   /** get label.
   */
   public String getLabel()   {
      return label;
   }
   /** set label.
   */   
   public boolean setLabel(String labelIn)  {
      return false;
   }
   /** get color.
   */   
   public String getColor()   {
      return color;
   }
   /** set color.
   */   
   public boolean setColor(String colorIn)   {
      return false;
   }
   /** get edge.
   */   
   public double getEdge() {
      return edge;
   }
   /** set edge.
   */   
   public boolean setEdge(double edgeIn)  {
      return false;
   }
   /** calculate surface area.
   */
   public double surfaceArea()   {
      return 0.0;
   }
   /** calculate volume.
   */
   public double volume()  {
      return 0.0;
   }
   /** calculate ratio.
   */
   public double surfaceToVolumeRatio()   {
      return 0.0;
   }
   /** return string representation.
   */
   public String toString()   {
      return "";
   }
}