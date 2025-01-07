package arrays;

import java.util.Arrays;

public class ElementsOfArrayInReverseOrder {

	public static void main(String[] args) {
		int a[]= {9,8,7,6,5,4,3,2,1,0};
		int b[]=  new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[a.length-1-i];
			
		}
		System.out.println(Arrays.toString(b));
		
	}

}
