package revamp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class P12MajorityElement {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,4,3,4,5,3,3,2,3,4,565,6,664};
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		System.out.println(map);
		int min=1;
		int max=0;
		for(Map.Entry<Integer, Integer> element:map.entrySet())
		{
			if(element.getValue()>max)
			{
				max=element.getValue();
				min=element.getKey();
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
