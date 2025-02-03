package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicatedifferent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,4,5,6,9,8,7,5,6,3,4,5,8,7,96,3,5,3,5,4,2,56,3,54};
		
		Set<Integer> set = new HashSet<>();
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int num:arr)
		{
			set.add(num);
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		System.out.println(set);
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			System.out.println("The Number "+entry.getKey()+" came "+entry.getValue()+" Times in the array");
		}
	}

}
