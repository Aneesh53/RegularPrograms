package revamp;

import java.util.HashMap;
import java.util.Map;

public class P29LouiesString {
	
	public static String concat(String s1,String s2,String R)
	{
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c: R.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c:s1.toCharArray())
		{
			if(!map.containsKey(c)|| map.get(c)==0)
			{
				return "NO";
			}
			map.put(c,map.get(c)-1);
		}
		for(char c:s2.toCharArray())
		{
			if(!map.containsKey(c)|| map.get(c)==0)
			{
				return "NO";
			}
			map.put(c,map.get(c)-1);
		}
		
		return "YES";
		
	}

	public static void main(String[] args) {

		System.out.println(concat("RMA","CHARAN","RAMCHARAN"));

	}

}
