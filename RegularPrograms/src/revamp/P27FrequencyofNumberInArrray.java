package revamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P27FrequencyofNumberInArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,22,2,2,2,2,23,3,4,3,2,3,4,5,6,7,75,4,3,4,5,6,4,3,4,56,43,4,56,7,75,43,32,34,56,67,543,22,221,2,2,3,4,5,64,32,3,45};
		Map<Integer,Integer> map=new HashMap<>();
		Set<Integer>set=new HashSet<>();
		
		for(int i=0;i<array.length;i++)
		{
			map.put(array[i],map.getOrDefault(array[i], 0)+1);
			set.add(array[i]);
		}
		for(Map.Entry<Integer, Integer> element:map.entrySet())
		{
			System.out.println("The element with "+element.getKey()+" has the frequency of "+element.getValue());
		}
		List<Integer> list=new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list.toString());
		
		
		

	}

}
