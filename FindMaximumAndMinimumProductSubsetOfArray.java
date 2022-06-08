package array.preperation;

import java.util.Arrays;

public class FindMaximumAndMinimumProductSubsetOfArray {

	static int arr[] = { -4, -3, -2, 3, 7, 5, 0, 1 };
	static int arrNegative[] = Arrays.stream(arr).filter(x -> x < 0).toArray();
	static int minNegativeValue = 0;
	static int arrPositive[] = arr;
	static int productArr[] = arrPositive;
	static boolean negativeCountEven = arrNegative.length % 2 == 0;

	public static void main(String[] args) {

		arrPositive = Arrays.stream(arr).filter(x -> x > 1 || x < 0).toArray();
		minNegativeValue = Arrays.stream(arrNegative).max().getAsInt();
		int[] arrWithoutMinNegativeValue = Arrays.stream(arrPositive).filter(x -> x != minNegativeValue).toArray();

		// maxProduct
		if (negativeCountEven) {
			productArr = arrPositive;
		} else {
			productArr = arrWithoutMinNegativeValue;
		}

		System.out.println("MaxProduct = " + product(productArr));

		// maxProduct
		if (negativeCountEven) {
			productArr = arrWithoutMinNegativeValue;
		} else {
			productArr = arrPositive;
		}
		
		System.out.println("MinProduct = " + product(productArr));

	}

	static int product(int[] productArr2) {
		int productVal = 1;
		if(productArr2.length > 0) {
		for (int i = 0; i < productArr2.length; i++) {
			productVal *= productArr[i];
		}
		}
		return productVal;
	}

}
