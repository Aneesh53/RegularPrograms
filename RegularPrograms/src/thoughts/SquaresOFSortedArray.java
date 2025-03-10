package thoughts;

import java.util.Arrays;

public class SquaresOFSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {9,7,2,1,3,4,6,8,5};
		Arrays.sort(array);
		int squaredArray[]=new int[array.length];
		int i=0;
		for(int num:array)
		{
			squaredArray[i]=array[i]*array[i];
			i++;
		}
		System.out.println(Arrays.toString(squaredArray));

	}

}
