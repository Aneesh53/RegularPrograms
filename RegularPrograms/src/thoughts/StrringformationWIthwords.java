package thoughts;

import java.util.Arrays;

public class StrringformationWIthwords {
	
	public static boolean checkofstring(String str,String word)
	{
		char[] chars=str.toCharArray();
		char[] wordhello=word.toCharArray();
		Arrays.sort(chars);
		Arrays.sort(chars);
		int j=0;
		for(int i=0;i<chars.length&&j<wordhello.length;i++)
		{
			if(chars[i]==wordhello[i])
			{
				j++;
			}
		}

		return j==str.length();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String[] words={"leloh","heolo","heymaold","jadjbvajdvb"};
		boolean found=false;
		for(String word:words)
		{
			if(checkofstring(str, word))
			{
				System.out.println("word can be found: +"+word);
			}
			if(!found)
			{
				System.out.println(false);
			}
		}
		

	}

}
