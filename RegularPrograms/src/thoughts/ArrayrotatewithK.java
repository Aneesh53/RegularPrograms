package thoughts;

import java.util.Arrays;

public class ArrayrotatewithK {
	
	public static void main(String[] args) {
		int array[]= {3,2,1,2,3,4,5,6,7,8,9,10,11,25,26};
		int result[]=new int[array.length];
		int shift=5;
		for(int i=0;i<array.length;i++)
		{
			int index=(i+shift)%array.length;
			result[index]=array[i];
		}
		System.out.println(Arrays.toString(result));
	}

}
