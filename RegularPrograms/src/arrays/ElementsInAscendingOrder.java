package arrays;

import java.util.Arrays;

public class ElementsInAscendingOrder {

	public static void main(String[] args) {
		int arr[]= {14,26,11,36,2,15,24,43,6,5,4,7,8,9,7,56,2,4,85,5};
		int b[] = new int[arr.length];
		int n = arr.length; 
		for (int i = 0; i < n - 1; i++)
		{ 
			for (int j = 0; j < n - i - 1; j++) 
			{ 
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			b[i]=arr[i];
		}
	System.out.println(Arrays.toString(b));
	System.out.println("The SecondLargestNumber in this array is: "+b[b.length-2]);
	System.out.println("The SecondSmallestNumber in the array is: "+b[1]);
	}
}
