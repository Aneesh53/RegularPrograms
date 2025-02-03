package string;

public class DuplicateCharacterInString {
	public static void main(String[] args) {
		
	

	String s="abcdefghg".toLowerCase();
	char[] character=s.toCharArray();
	System.out.println(character);
	boolean isnotDuplicate=false;
	for (int i=0;i<s.length();i++)
	{
		boolean isDuplicate = false;
		for(int j=i+1;j<s.length();j++)	
		{
			if(character[i]==character[j])
			{
				isDuplicate=true;
				break;
			}
		}
		if(isDuplicate)
		{
			System.out.println("The duplicate letter is"+character[i]);
			isnotDuplicate=true;
		}
	}
	if(!isnotDuplicate) {
		System.out.println("NO Duplicates found");
	}
	
	
	}
	
}
