import java.util.Scanner;

public class Sorting {
	
	public static void main(String[] args) {
		
		//A scanner object is used to collect the following information from the user in order to create
		//an array with randomly generated integer values
		
		//number of elements that the array should contain
		int numberOfElements;
		//inclusive lower bound of the range to draw the integers from
		int lowerBound;
		//inclusive upper bound of the range to draw the integers from
		int upperBound;
		//whether to display array values to stdout, true equals yes, false equals no
		boolean print;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements should the array to be sorted contain?");
		numberOfElements = sc.nextInt();
		System.out.println("Enter the inclusive lower bound of the range from which integers should be generated:");
		lowerBound = sc.nextInt();
		System.out.println("Enter the inclusive upper bound of the range from which integers should be generated:");
		upperBound = sc.nextInt();
		System.out.println("Do you want array elements to be printed before and after sorting? Enter true for yes or false for no");
		print = sc.nextBoolean();
		System.out.println("Let's get started...");
		sc.close();
		//use user input values to call timeAllAlgorithms to test all implemented sorting algorithms in SortingAlgorithms.java
		SortingHelper.timeAllAlgorithms(numberOfElements, lowerBound, upperBound, print);
	}

}
