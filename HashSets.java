// Java program to demonstrate equals()
// method of HashSet

import java.util.*;

public class HashSets {
	public static void main(String[] argv)
	{

		// Creating object of HashSet<String>
		HashSet<String>
			arrset1 = new HashSet<String>();

		// Populating arrset1
		arrset1.add("A");
		arrset1.add("B");
		arrset1.add("C");
		arrset1.add("D");
		arrset1.add("E");

		// print arrset1
		System.out.println("First HashSet: "
						+ arrset1);

		// Creating another object of HashSet<String>
		HashSet<String>
			arrset2 = new HashSet<String>();

		// Populating arrset2
		arrset2.add("A");
		arrset2.add("B");
		arrset2.add("C");
		arrset2.add("D");
		arrset2.add("E");

		// print arrset2
		System.out.println("Second HashSet: "
						+ arrset2);

		// comparing first HashSet to another
		// using equals() method
		boolean value
			= arrset1.equals(arrset2);

		// print the value
		System.out.println("Are both set equal: "
						+ value);
	}
}