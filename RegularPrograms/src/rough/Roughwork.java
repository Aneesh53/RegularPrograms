package rough;

public class Roughwork {
	
	public static void main(String[] args) {
		String str="10101110";
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='1')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
