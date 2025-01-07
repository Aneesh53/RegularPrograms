package string;

public class DuplicateCharacterInString {
	public static void main(String[] args) {
		
	

	String s="abcdefgh".toLowerCase();
	char[] character=s.toCharArray();
	System.out.println(character);
	boolean isnotDuplicate=false;
	for (int j=0;j<s.length();j++)
	{
		boolean isDuplicate = false;
		for(j=j+1;j<s.length();j++)	
		{
			if(character[j]==character[j])
			{
				isDuplicate=true;
				break;
			}
		}
		if(isDuplicate)
		{
			System.out.println(character[j]);
			isnotDuplicate=true;
		}
	}
	if(!isnotDuplicate) {
		System.out.println("NO Duplicates found");
	}
	
	
	}
	
}
