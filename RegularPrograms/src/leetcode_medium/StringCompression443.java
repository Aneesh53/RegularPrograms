package leetcode_medium;

import java.util.HashMap;
import java.util.Map;

public class StringCompression443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars= {'a','a','b','b','c','c','c'};
		StringBuilder str=new StringBuilder();
		Map<Character,Integer>map=new HashMap<>();
		for(char c:chars)
		{
			map.put(c,map.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character, Integer>entry:map.entrySet())
		{
			str.append(entry.getKey()).append(entry.getValue());
		}
		int value=str.length();
		System.out.println(value);

	}

}
