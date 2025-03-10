package leetcode;

import java.util.Arrays;

public class MovingZerosright5 {
	public static void shiftZero(int[] array)
	{
		
		int count=0;
		for(int num:array)
		{
			if(num!=0)
			{
				array[count++]=num;
			}
		}
		while(count<array.length)
		{
			array[count++]=0;
		}
		System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args) {
		int array[]= {1,2,0,4,5,0,6,0,7,8,9,0,2,3};
		shiftZero(array);
	}

}
