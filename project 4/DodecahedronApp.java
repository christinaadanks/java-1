import java.util.Scanner;
/**
 * Driver class for Dodecahedron.
 *
 * @author Christina L
 * @version 9/9/2020
 */
 
public class DodecahedronApp  {

   /**
    * Prints dodecahedron objects.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      // variable declaration
      Scanner userInput = new Scanner(System.in);
      String labelInput;
      String colorInput;
      double edgeInput;
      
      // request user input
      System.out.println("Enter label, color, and"
         + " edge length for a dodecahedron.");
      System.out.print("\tlabel: ");
      labelInput = userInput.nextLine();
      
      System.out.print("\tcolor: ");
      colorInput = userInput.nextLine();
      
      System.out.print("\tedge: ");
      edgeInput = userInput.nextDouble();

      // print results from user input
      Dodecahedron user = new Dodecahedron(labelInput, colorInput, edgeInput);
      if (edgeInput <= 0)   {
         System.out.println("Error: edge must be greater than 0.");
      }
      else  {
         System.out.print("\n" + user);
      }
      
      
   }


}
