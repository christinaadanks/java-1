import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program that read in data file information.
 *
 * @author Christina L
 * @version 9/17/2020
 */

public class DodecahedronListApp {
   /**
    * Reads in inputted file and prints out objects in ArrayList.
    * @param args Command line arguments (not used).
    * @throws FileNotFoundException if no file is found.
    */
   public static void main(String[] args) throws FileNotFoundException  {
      Scanner scan = new Scanner(System.in);
      ArrayList<Dodecahedron> inputList = new ArrayList<Dodecahedron>();
      String input;
      String fileName;
      String label = "";
      String color = "";
      double edge = 0.0;
      
      System.out.print("Enter file name: ");
      fileName = scan.nextLine(); // scan file name.
      
      // scan input file.
      Scanner fileScan = new Scanner(new File(fileName));
      input = fileScan.nextLine(); // scan list name.
            
      // read each line from file and store in ArrayList.
      while (fileScan.hasNext()) {
         label = fileScan.nextLine();
         color = fileScan.nextLine();
         edge = Double.parseDouble(fileScan.nextLine());
         
         Dodecahedron objList = new Dodecahedron(label, color, edge);
         inputList.add(objList); // add scanned data to new obj list.
         
      }
      fileScan.close();    // close file.
      
      DodecahedronList dodecaList = new DodecahedronList(input, inputList);
      
      
      
      System.out.println("\n" + dodecaList.toString());
      System.out.println("\n" + dodecaList.summaryInfo());
   
   }




}
