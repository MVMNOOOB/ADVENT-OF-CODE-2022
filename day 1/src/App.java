
// Java Program to Illustrate reading from
// FileReader using FileReader class

// Importing input output classes
import java.io.*;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.Vector;
import java.util.*;

// Main class
// ReadingFromFile
public class App {

	static String Input = "";
	public static String[] lines;
	public static Vector<String> linesArr = new Vector<String>();
	public static String[] lines2;

	// Main driver method
	public static void main(String[] args) throws Exception {

		try (// Passing the path to the file as a parameter
				FileReader fr = new FileReader(
						"J:/#CODESTUFF/dumps/ADVENT OF CODE 2022/day 1 java/lib/input.txt")) {
			int i;
			while ((i = fr.read()) != -1) {
				Input += (char) i;
			}
		}

		/*
		 * // Declaring loop variable
		 * int i;
		 * // Holds true till there is nothing to read
		 * while ((i = fr.read()) != -1)
		 * 
		 * // Print all the content of a file
		 * System.out.print((char)i);
		 */

		lines = Input.split("\\R");
		Collections.addAll(linesArr, lines);
		linesArr.add("");
		// Collections.addAll(lines, linesArr);
		lines2 = new String[linesArr.size()];
		linesArr.copyInto(lines2);

		System.out.println("-lines.length: " + lines.length + "\n");

		ArrayList<Integer> elvesInventory = new ArrayList<Integer>();

		int start = 0; // let start = 0;
		while (start != (lines.length + 1)) { // while (start != inputEnd) {
			// Group k = new Group(start);
			Group.createGroup(start); // const end = someOperation(start);
			start = (Group.getEndIndex() + 1); // start = end;
			elvesInventory.add(Group.getGroupTotal()); // place the final total in the arraylist }

		}

		System.out.println(
				"-Largest array element: " + Collections.max(elvesInventory) + "(this is our solution)" + "\n");

	}
}