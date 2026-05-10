

import java.util.ArrayList;
import java.util.Scanner;

public class Espino_Module9_2 {
    public static void main(String[] args) {
      // create a ArrayList of String, baby names
      ArrayList<String> babynamesList = new ArrayList<String>();  
      //fill the ArrayList with minimum of 10 Strings
      
      babynamesList.add("Selena");
      babynamesList.add("Eliza");
      babynamesList.add("Celeste");
      babynamesList.add("Christian");
      babynamesList.add("Mateo");
      babynamesList.add("Ivan");
      babynamesList.add("Emilia");
      babynamesList.add("Nicolas");
      babynamesList.add("Camila");
      babynamesList.add("Xavier");
      
      System.out.print("The list of baby names are:");
      for(int i = 0; i < babynamesList.size(); i++) {
          System.out.print("\t" + babynamesList.get(i) + (i < babynamesList.size() - 1 ? "," : ""));
      }

      Scanner sc  = new Scanner(System.in);
      System.out.print("\nEnter the index (0-9) of which element you would like to see again: ");
      
      try {
          String input = sc.next();
          int index = Integer.parseInt(input);

          System.out.println("The element is: " + babynamesList.get(index));
      
      } catch (IndexOutOfBoundsException e) {
          System.out.println("Error: Out of Bounds");

      } catch (NumberFormatException e) {
          System.out.println("Error: Please enter a valid number.");
      
      }      
    }
}
