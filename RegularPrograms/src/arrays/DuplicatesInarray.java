package arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInarray {

	public static void main(String[] args) {
		int arr[]= {2,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,7,4,5,85,6,42,35,4,5,7};
		Map<Integer,Integer> freq= new HashMap<>();
		
		for(int num:arr)
		{
			freq.put(num, freq.getOrDefault(num,0)+1);
		}
		for(Map.Entry<Integer,Integer> mp:freq.entrySet())
		{
			if(mp.getValue()>1)
			{
			System.out.println("The Number "+mp.getKey()+ " Duplicated "+mp.getValue()+" times.");
			}
		}
	}

}
