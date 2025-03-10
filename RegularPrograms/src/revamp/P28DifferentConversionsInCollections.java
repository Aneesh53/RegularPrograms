package revamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P28DifferentConversionsInCollections {
	
	public static void ArraysToArrayList(int array[])
	{
		List<Integer> list=new ArrayList<>();
		for(int n:array)
		{
			list.add(n);
		}
		System.out.println(list);
	}
	public static void ArraysToSet(int array[])
	{
		Set<Integer>set=new HashSet<>();
		for(int n:array)
		{
			set.add(n);
		}
		System.out.println(set.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,3,4,5,6,7,8,6,5,4,4,3,3,2,3,4,5,5,6};
		ArraysToArrayList(array);
		ArraysToSet(array);
	}

}
