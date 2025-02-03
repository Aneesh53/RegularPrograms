package revamp;

import java.util.Arrays;

public class P5MaxElementsinArray {

	public static void main(String[] args) {
		int array1[]={222,332,324,543,467,66,5443,34,5,5675,5645,3424,4355,533,345,6667,234,5,56,67,23};
		Arrays.sort(array1);
		int min=array1[0];
		int max=array1[array1.length-1];
		
		System.out.println("The smalllest Number in Array is: "+min);
		System.out.println("The Largest Number in Array is: "+max);

	}

}
