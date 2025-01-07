package string;

public class ReverseAstring {

	public static void main(String[] args) {
		String input="9848330459".toLowerCase();
		char[] character=input.toCharArray();
		String  ReversedString="";
		for(int i=input.length()-1;i>=0;i--)
		{
			ReversedString+=input.charAt(i);
		}
		System.out.println("The Reversed String is: "+ReversedString);

	}

}
