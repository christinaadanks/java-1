import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
  
/**
 * Program to print and edit a read in file.
 * @author Christina L
 * @version 9/26/2020
 */

public class DodecahedronListMenuApp   {

/**
 * Provides user with a list of menu choices for DodecahedronList.
 * @param args Command line argument - not used.
 * @throws IOException if no file is found.
 */

   public static void main(String[] args) throws IOException {
   
      String listName = "***no list name assigned***";
      ArrayList<Dodecahedron> newList = new ArrayList<Dodecahedron>();
      DodecahedronList dList = new DodecahedronList(listName, newList);
      String fileName = "no file name";
      
      String code = "";
      
      String label, color;
      double edge;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Dodecahedron List System Menu\n"
               + "R - Read File and Create Dodecahedron List\n"
               + "P - Print Dodecahedron List\n"
               + "S - Print Summary\n"
               + "A - Add Dodecahedron\n"
               + "D - Delete Dodecahedron\n"
               + "F - Find Dodecahedron\n"
               + "E - Edit Dodecahedron\n"
               + "Q - Quit");
      
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         
         if (code.length() == 0) {
            continue;
         }
         
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch (codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               
               dList = dList.readFile(fileName);
               
               System.out.println("\tFile read in and "
                           + "Dodecahedron List created\n");
               break;
               
            case 'P':
               System.out.println(dList.toString());
               break;
               
            case 'S':
               System.out.println("\n" + dList.summaryInfo() + "\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               
               dList.addDodecahedron(label, color, edge);
               System.out.println("\t*** Dodecahedron added ***\n");
               
               break;
              
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (dList.deleteDodecahedron(label) != null)   {
                  dList.deleteDodecahedron(label);
                  System.out.println("\t\"" + label + "\" " + "deleted\n");
               }
               else  {
                  System.out.println("\t\"" + label + "\" " + "not found\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (dList.findDodecahedron(label) != null)   {
                  System.out.println(dList.findDodecahedron(label).toString()
                                                + "\n");
               }
               else  {
                  System.out.println("\t\"" + label + "\" " + "not found\n");
               }
            
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               
               if (dList.findDodecahedron(label) != null)   {
                  dList.editDodecahedron(label, color, edge);
                  System.out.println("\t\"" + label + "\" "
                                       + "successfully edited\n");
                  
               }
               
               else  {
                  System.out.println("\t\"" + label + "\" " + "not found\n");
               }
               break;
               
            case 'Q':
               break;
               
            default:
               System.out.println("\t*** invalid code ***\n");
               
               
            
                 
         }
      } while (!code.equalsIgnoreCase("Q"));
   
   }

   
   



}
