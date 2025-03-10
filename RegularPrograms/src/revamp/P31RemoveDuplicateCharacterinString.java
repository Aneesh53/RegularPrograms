package revamp;

import java.util.ArrayList;
import java.util.List;

public class P31RemoveDuplicateCharacterinString {

	public static void main(String[] args) {
		String str="aneeshKumar";
		List<Character> list= new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			char currentchar=str.charAt(i);
			if(!list.contains(currentchar))
			{
				list.add(currentchar);
			}
		}
		StringBuilder dup=new StringBuilder();
		for(char c:list)
		{
			dup.append(c);
		}
		System.out.println(dup);
		
	}

}
