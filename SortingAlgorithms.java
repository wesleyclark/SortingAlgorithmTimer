
public class SortingAlgorithms {
	
	//list of algorithm names; this list is looped through in SortingHelper.java to call each 
	//sorting algorithm; if you implement a new sorting algorithm, you should add its name to this
	//array in addition to updating the timeSort method in SortingHelper.java; otherwise,
	//the newly implemented algorithm will not be called by the timeAllAlgorithms method of SortingHelper.java
	public static String[] listOfAlgorithms = {"bubble", "insertion", "merge"};
	
	//bubble sort implementation
	public static void bubbleSort(int[] numbers) {
	    boolean changed = false;
	    do {
	        changed = false;
	        for (int a = 0; a < numbers.length - 1; a++) {
	            if (numbers[a] > numbers[a + 1]) {
	                int tmp = numbers[a];
	                numbers[a] = numbers[a + 1];
	                numbers[a + 1] = tmp;
	                changed = true;
	            }
	        }
	    } while (changed);
	}
	
	//insertion sort implementation
	public static void insertionSort(int[] numbers){
		  for(int i = 1; i < numbers.length; i++){
		    int value = numbers[i];
		    int j = i - 1;
		    while(j >= 0 && numbers[j] > value){
		      numbers[j + 1] = numbers[j];
		      j = j - 1;
		    }
		    numbers[j + 1] = value;
		  }
	}
	
	//merge sort implementation
	public static void mergeSort(int[] numbers){
		if (numbers.length > 1) {
			//copy the left half of the array
			int[] leftHalf = new int[numbers.length / 2];
			System.arraycopy(numbers, 0, leftHalf, 0, numbers.length / 2);			
			//copy the right half of the array
			int lengthOfRightHalf = numbers.length - numbers.length / 2;
			int[] rightHalf = new int[lengthOfRightHalf];
			System.arraycopy(numbers, numbers.length / 2, rightHalf, 0, lengthOfRightHalf);
			//merge sort left half
			mergeSort(leftHalf);
			//merge sort right half
			mergeSort(rightHalf);
			//merge left half with right half into the input array
			merge(leftHalf, rightHalf, numbers);
		}
	}
	
	public static void merge(int[] firstList, int[] secondList, int[] tempList){
		int firstListIndex = 0; //the current index in firstList
		int secondListIndex = 0; //the current index in secondList
		int tempListIndex = 0; //the current index in tempList
		
		while (firstListIndex < firstList.length && secondListIndex < secondList.length){
			if (firstList[firstListIndex] < secondList[secondListIndex])
				tempList[tempListIndex++] = firstList[firstListIndex++];
			else
				tempList[tempListIndex++] = secondList[secondListIndex++];
		}
		
		while (firstListIndex < firstList.length)
			tempList[tempListIndex++] = firstList[firstListIndex++];
		
		while (secondListIndex < secondList.length)
			tempList[tempListIndex++] = secondList[secondListIndex++];
	}
	
}
