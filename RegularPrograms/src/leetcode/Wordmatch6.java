package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Wordmatch6 {
	
	public static boolean wordPattern(String pattern, String s) {
		String[] words=s.split(" ");
		if (pattern.length() != words.length) {
			return false;
		}
		Map<Character,String>map=new HashMap<>();
		Map<String,Character>reversemap=new HashMap<>();
		
		
		for(int i=0;i<pattern.length();i++)
		{
			char c=pattern.charAt(i);
			String word=words[i];
			if(map.containsKey(c))
			{
				if(!map.get(c).equals(word))
				{
					return false;
				}
			}
			else
			{
				if(reversemap.containsKey(word))
				{
					return false;
				}
				map.put(c, word);
				reversemap.put(word,c);
			}
		}
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		System.out.println(wordPattern("abba","dog cat cat dog"));
	}

}
