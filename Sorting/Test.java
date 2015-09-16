import java.util.Random;
import java.util.Arrays;


public class Test{
	public static void main(String args[]){
		int[] inputs = randomGenerate(100,100);
		System.out.println("original array: "+ Arrays.toString(inputs));
		
		//BubbleSort Testing
		BubbleSort.sort(inputs);
		System.out.println("bubblesort array: "+ Arrays.toString(inputs));
	
	}
	
	
	public static int[] randomGenerate(int length, int max){
		int[] array = new int[length];
		Random gen = new Random();
		for (int i = 0; i < length; i ++){
			array[i] = gen.nextInt(max);
		}
		return array;
	}
}