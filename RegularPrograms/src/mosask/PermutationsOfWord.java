package mosask;

public class PermutationsOfWord {
	public static void permutate(String str)
	{
		generate(str,"");
	}
	private static void generate(String str,String prefix)
	{
		if(str.length()==0)
		{
			System.out.println(prefix);
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				String remaing=str.substring(0,i)+str.substring(i+1);
				generate(remaing,prefix+ch);
			}
		}
	}
	
	public static void main(String[] args) {
		permutate("abcde");
		
	}

}
