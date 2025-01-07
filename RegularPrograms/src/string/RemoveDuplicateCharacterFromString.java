package string;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterFromString {
	public static String removeduplicates(String inputstring)
	{
		String lowercase=inputstring.toLowerCase();
		char[] charcaters=lowercase.toCharArray();
		LinkedHashSet <Character> uniqueCharacters=new LinkedHashSet<>();
		for(char character:charcaters)
		{
			if(!uniqueCharacters.contains(character))
			{
				uniqueCharacters.add(character);
			}
		}
		StringBuilder result= new StringBuilder();
		for(char character:uniqueCharacters)
		{
			result.append(character);
		}
		return result.toString();
		
	}

	public static void main(String[] args) {
		String input="aneeshkumarchoWdary";
		String Result=removeduplicates(input);
		System.out.println(Result);

	}

}
