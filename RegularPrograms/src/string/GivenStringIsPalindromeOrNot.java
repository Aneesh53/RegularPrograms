package string;

public class GivenStringIsPalindromeOrNot {
	public static void main(String[] args) {
		String word="madam".toLowerCase();
		String reversed="";
		char[] characters=word.toCharArray();
		for(int i=word.length()-1;i>=0;i-- )
		{
			reversed=reversed+word.charAt(i);
		}
		if(word.equals(reversed))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}		
	}

}
