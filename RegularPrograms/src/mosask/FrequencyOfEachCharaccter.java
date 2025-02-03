package mosask;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachCharaccter {

	public static void main(String[] args) {
		char[] chars= {'a','b','c','e','f','g','e','a','b','q','v','a','b','a','c'};
		Map<Character,Integer> freq=new HashMap<>();
		for(char c:chars)
		{
			freq.put(c,freq.getOrDefault(c,0)+1);
		}
		System.out.println(freq);

	}

}
