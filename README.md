SortingAlgorithmTimer
=====================

Based on user input, the program creates arrays of random integer values and calculates the time it takes for implemented sorting algorithms to run

The main method is in Sorting.java.

If you implement a new sorting algorithm, you should:
1.) Create the sorting method in SortingAlgorithms.java
2.) Add a String with the name of the sorting method in listOfAlgorithms[] in SortingAlgorithms.java.
3.) Add a conditional code block based on the String you just added to call and time the algorithm to the timeSort method of SortingHelper.java

Printed duration is in milliseconds, so divide by 1000 to get seconds. Depending on your hardware, you will start seeing noticeable differences somewhere at or above 100K element arrays
