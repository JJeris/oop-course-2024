package jtm.extra02;

import java.util.ArrayList;
import java.util.List;


public class ArrayListMethods {
	List<Integer> myList = new ArrayList<Integer>();

	public List<Integer> checkArray(int comparator, int... numbers) {
		// TODO #1:Implement method that compares values of passed array with
		// passed comparator.
		// Return list with values that are smaller than comparator.
		// Hint: Investigate how varargs are used.
		for (int i: numbers) {
			if (i < comparator) {
				myList.add(i);
			}
		}
		return myList;
	}

	public int sumResult() {
		int sum = 0;
		for (int i: myList) {
			sum = sum + i;
		}
		return sum;
	}
}
