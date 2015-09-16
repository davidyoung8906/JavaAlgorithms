/*
Input: Array of integers
Output: Sorted array of integers
Space: O(1) Bubbulesort do not need extra array.

Note: The value of a java array is the reference to the array.
*/

public class BubbleSort {

	public static void sort(int [] inputs){
		int length = inputs.length;
		for (int i = 0; i <= length -1; i++){
			//iterate from end of array to i, and put the smallest number at inputs[i]
			for(int j =length -1; j >= i+1; j--){
				//compare j with j-1, swap if j-1 is larger than j
				if(inputs[j-1] > inputs[j]){
					int temp = inputs[j-1];
					inputs[j-1] = inputs[j];
					inputs[j] = temp;
				}
			}
		}
	}

}