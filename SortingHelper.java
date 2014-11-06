import java.util.Random;


public class SortingHelper {	
	
	 //create an integer array of random Integers. The size of the array, the lower bound (inclusive)
	 //of the range to draw from, and the upper bound (inclusive) of the range to draw from must be specified.

	public static int[] createRandomIntegerArray(int size, int lowerBound, int upperBound){
		int[] temp = new int[size];
		Random r = new Random();
		for (int i = 0; i < temp.length; i++){
			//since nextInt returns a random int in the range 0 inclusive to the specified number exclusive, 
			//1 is added to the specified value to make the range include the specific value;
			//the value of the lower bound is added to the random integer to change the lower bound from zero to
			//the value of the lower bound
			temp[i] = r.nextInt(upperBound + 1) + lowerBound;
		}
		return temp;
	}
	
	
	//helper function to print the contents of an array
	public static void printArray(int[] numbers){
			System.out.println("The array looks like this:");
			for (int i = 0; i < numbers.length; i++){
				System.out.print(numbers[i] + " ");
			}
		System.out.println();
	}
	


	//calls a specific sorting algorithm based on a string identified
	//and returns a double that is the time it takes for the algorithm to sort the array argument;
	//if a new sorting algorithm is implemented in SortingAlgorithms.java, this method needs to be
	//updated to include a conditional code block with the algorithm's name, timing calls, and a call to 
	//the newly implemented algorithm

	public static double timeSort(String sortingAlgorithmName, int[] numbers){
		long startTime = 0;
		long endTime = 0;
		if (sortingAlgorithmName.equals("bubble")){
			startTime = System.nanoTime();
			SortingAlgorithms.bubbleSort(numbers);
			endTime = System.nanoTime();			
		}
		else if (sortingAlgorithmName.equals("insertion")){
			startTime = System.nanoTime();
			SortingAlgorithms.insertionSort(numbers);
			endTime = System.nanoTime();			
		}
		double duration =  (endTime - startTime) / 1000000.0;	
		return duration;
	}
	
	//loops through the array of algorithm names in SortingAlgorithms.java to call each sorting algorithm;
	//with each called algorithm, a deep copy of the randomly generated numbers array is created
	public static void timeAllAlgorithms(int size, int lowerBound, int upperBound, boolean print){
		int[] numbers = SortingHelper.createRandomIntegerArray(size, lowerBound, upperBound);
		for (int i = 0; i < SortingAlgorithms.listOfAlgorithms.length; i++){
			int[] temp = SortingHelper.deepCopy(numbers);			
			String algorithm = SortingAlgorithms.listOfAlgorithms[i];
			System.out.println("Now doing " + algorithm + " sort");
			if (print)
				SortingHelper.printArray(temp);
			double duration = SortingHelper.timeSort(algorithm, temp);
			if (print)
				SortingHelper.printArray(temp);
			System.out.println("The " + algorithm + " sort took " + duration + " milliseconds");
			
		}
	}
	
	//helper method to deep copy an array
	public static int[] deepCopy(int[] numbers){
		int[] temp = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++){
			temp[i] = numbers[i];
		}
		return temp;
	}

}
