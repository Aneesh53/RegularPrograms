package arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		int numbers[]= {1,2,3,4,5,6,8,8,9,8,1,2,3,5,23,52,5,2,2,22,2,2,2,2,2};
		Map<Integer,Integer>freq=new HashMap<>();
		for(int num:numbers)
		{
			freq.put(num,freq.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:freq.entrySet())
		{
			System.out.println("Element: "+entry.getKey()+" Frequency "+entry.getValue());
		}

	}

}
