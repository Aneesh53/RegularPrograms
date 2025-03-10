package revamp;

public class P16LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World maintain";
		char[] chars=s.toCharArray();
		int target=-1;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(chars[i]==' ')
			{
				target=i;
				break;
			}
		}
		System.out.println((s.length())-(target+1));
	}

}
