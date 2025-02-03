package revamp;

import java.util.Arrays;

public class P20ShiftAllZerosToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {2,3,0,3,4,5,0,56,70,0,5,0,0,0,3,4,0,0};
		int[] nonzero=new int[array.length];
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				nonzero[count++]=array[i];
			}

		}
		System.out.println(Arrays.toString(nonzero));

	}

}
