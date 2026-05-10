

import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class DataFile {
	public static void main(String[] args) {
		String fileName = "data.txt";
		Random rand = new Random();


		try (FileWriter fw = new FileWriter(fileName, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw)) {


		  for (int i = 0; i < 10; i++) {
		  	out.print(rand.nextInt(100) + " ");

		  }
		  out.println();
		  System.out.println("10 numbers successfully added to " + fileName);

		} catch (IOException e) {
			System.out.println("An error occurred during writing." + e.getMessage());
		}


		System.out.print("Current File Content: ");
		try (Scanner fileScanner = new Scanner(new File(fileName))) {
			while (fileScanner.hasNext()) {
				System.out.print(fileScanner.next() + " ");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			
			}
		}
	}