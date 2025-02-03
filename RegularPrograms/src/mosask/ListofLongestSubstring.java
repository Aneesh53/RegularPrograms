package mosask;

import java.util.LinkedHashSet;
import java.util.Set;

public class ListofLongestSubstring {
	public static int LongestSubString(String s)
	{
		Set<Character> set=new LinkedHashSet<>();
		int start=0;
		int maxlentgh=0;
		for(int end=0;end<s.length();end++)
		{
			while(set.contains(s.charAt(end)))
			{
				set.remove(s.charAt(start));
				start++;
			}
			set.add(s.charAt(end));
			if(end-start+1>maxlentgh)
			{
				maxlentgh=end-start+1;
			}
			
		}
		return maxlentgh;
		
	}

	public static void main(String[] args) {
		System.out.println(LongestSubString("anedesh"));
		

	}

}
