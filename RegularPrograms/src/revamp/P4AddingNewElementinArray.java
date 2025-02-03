package revamp;

import java.util.Arrays;

public class P4AddingNewElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]={222,332,324,543,467,66,5443,34,5,5675,5645,3424,4355,533,345,6667,234,5,56,67,23};
		int newArray[]=new int[array1.length+1];
		int index=11;
		int value=6007;
		for(int i=0;i<index;i++)
		{
			newArray[i]=array1[i];
		}
		newArray[index]=value;
		for(int j=index;j<array1.length-1;j++)
		{
			newArray[j+1]=array1[j];
		}
		System.out.println("The original Array is: "+Arrays.toString(array1));
		System.out.println("The Updated Array is: "+Arrays.toString(newArray));

	}

}
