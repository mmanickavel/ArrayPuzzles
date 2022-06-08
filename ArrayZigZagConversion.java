package array.preperation;

import java.util.Arrays;

public class ArrayZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zigZag();
	}

	static void zigZag() {
		int arr[] = { 1, 7, 3, 1, 5, 6, 7 };

		// Flag true indicates relation "<" is expected,
		// Flag false indicates relation ">" is expected,
		// First relation is "<"

		boolean flag = true;
		int temp = 0;

		for (int i = 0; i <= arr.length - 2; i++) {

			if (flag) {
				// checking & changing to this "<" relation
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			} else {
				// checking & changing to this ">" relation
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

			// flip flag
			flag = !flag;
		}
		System.out.println(Arrays.toString(arr));
	}

}
