package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Returnanagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String arr[]={"eat","tea","tan","ate","nat","bat"};
		 Map<String,List<String>> anagramwords=new HashMap();
		 for (String str:arr)
		 { 
			 char[] chars=str.toCharArray();
			 Arrays.sort(chars);
			 String anagram=new String(chars);
			 anagramwords.putIfAbsent(anagram, new ArrayList());
			 anagramwords.get(anagram).add(str); 
		 }
		 for(Map.Entry<String, List<String>> entry:anagramwords.entrySet())
		 {
			 System.out.println(entry.getValue());
		 }
		 

	}

}
