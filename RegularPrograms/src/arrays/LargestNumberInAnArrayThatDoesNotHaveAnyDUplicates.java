package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestNumberInAnArrayThatDoesNotHaveAnyDUplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,3,2,7,3,4,8};
		int temp=-1;
		Arrays.sort(arr);
		Set<Integer> duplicates=new HashSet<>();
		Set<Integer> uniques=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!uniques.add(arr[i]))
			{
				duplicates.add(arr[i]);
			}
		}
		for(int num:arr)
		{
			if(!duplicates.contains(num) && num>temp)
			{
				temp=num;
			}
		}
		System.out.println(temp);
	}
}
