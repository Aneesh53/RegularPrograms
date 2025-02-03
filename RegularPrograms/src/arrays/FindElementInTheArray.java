package arrays;

import java.util.Arrays;

public class FindElementInTheArray {
	
	public static int getheaddressofelement(int[] arr,int n)
	{
		int value=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				value=i;
			}
		}
		
		return value;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,23,4,5,2,56,2,6,52,4,562,45,85,23,65,4,5,26,522,545,2,6,52,56};
		System.out.println(getheaddressofelement(arr,52));
		System.out.println(arr.length);
		Arrays.sort(arr);
		String d=Arrays.toString(arr);
		System.out.println(d);
		
				
				
		System.out.println();

	}

}
