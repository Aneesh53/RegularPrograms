package string;

public class RemovingWhiteSpaces {

	public static void main(String[] args) {
		String name="Remove White Spaces from the string";
		System.out.println(name.replaceAll("\\s",""));
		char[] characters=name.toCharArray();
		StringBuilder result= new StringBuilder();
		for(char character:characters)
		{
			if(character!=' ')
			{
				result.append(character);
			}
		}
		System.out.println(result.toString());

	}

}
