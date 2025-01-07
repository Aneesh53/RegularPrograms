package string;

public class NonSpacecharacterlentgh {
	public static void main(String[] args) {
		String input="Aneesh is a good boy with worst fate";
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(input);
		System.out.println("The length of of the string is: "+input.length());
		System.out.println("The length of of the string without Space is: "+count);
		
		
				
	}

}
