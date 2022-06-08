package array.preperation;

import java.util.Arrays;

public class MergeArraysByAlternateValues {

	public static void main(String[] args) {
		mergeArray();
	}

	static void mergeArray() {
		Integer[] arr1 = { 1, 3, 5, 7, 9, 11, 12 };
		Integer[] arr2 = { 2, 4, 6, 8, 10 };
		int k = arr1.length + arr2.length;
		Integer[] arr3 = new Integer[k];
		
		// you can initiate another variable also instead of modifying k
		k = 0;
		for (int i = 0; i < arr1.length || i < arr2.length; i++) {
			
			// checking the first array length
			if (i < arr1.length) {
				arr3[k] = arr1[i];
				k++;
			}
			
			// checking the second array length
			if (i < arr2.length) {
				arr3[k] = arr2[i];
				k++;
			}

		}
		System.out.println(Arrays.toString(arr3));
	}

}
