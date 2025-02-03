package revamp;

import java.util.Arrays;

public class P11PrintTheProductOfAnArrayExceptSelf {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		int result[]=new int[array.length];
		Arrays.fill(result, 1);
		int left=1;
		for(int i=0;i<array.length;i++)
		{
			result[i]=result[i]*left;
			left=left*array[i];
		}
		int right=1;
		for(int j=array.length-1;j>=0;j--)
		{
			result[j]=result[j]*right;
			right=right*array[j];
		}
		System.out.println(Arrays.toString(result));

	}

}
