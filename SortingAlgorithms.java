
public class SortingAlgorithms {
	
	//list of algorithm names; this list is looped through in SortingHelper.java to call each 
	//sorting algorithm; if you implement a new sorting algorithm, you should add its name to this
	//array in addition to updating the timeSort method in SortingHelper.java; otherwise,
	//the newly implemented algorithm will not be called by the timeAllAlgorithms method of SortingHelper.java
	public static String[] listOfAlgorithms = {"bubble", "insertion"};
	
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
	
}
