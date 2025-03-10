package revamp;

public class P37ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="Aneesh Kumar Chowdary Veluru".toLowerCase();
		String[] words=original.split(" ");
		String str="";
		for( String word:words)
		{
			for(int i=word.length()-1;i>=0;i--)
			{
				str=str+word.charAt(i);
			}
			str=str+" ";
		}
		System.out.println(str);
	}

}
