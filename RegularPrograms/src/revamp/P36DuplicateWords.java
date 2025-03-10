package revamp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P36DuplicateWords {
/*
 * Write a java program to find the duplicate words and their number of occurrences in a string

 */
	public static void main(String[] args) {
		
		String statement="Hello Aneesh there is volcano coming hello practice rn keira aneesh soon neymar is random".toLowerCase();
		char[] chars=statement.toCharArray();
		System.out.println(Arrays.toString(chars));
		String[] words=statement.split(" ");
		System.out.println("The no of words is: "+words.length);
		Map<String,Integer> map=new HashMap<String,Integer>();
		Map<Character,Integer> pam=new HashMap<Character,Integer>();
		
		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		for(char c:chars)
		{
			pam.put(c,pam.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<String, Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println("The Word "+entry.getKey()+" is duplicated "+entry.getValue()+ " times");
			}
		}
		for(Map.Entry<Character, Integer>dataset:pam.entrySet())
		{
			
			System.out.println("The Word "+dataset.getKey()+" is duplicated "+dataset.getValue()+ " times");
			
		}
		
	}

}
