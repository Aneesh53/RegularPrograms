package leetcode;

public class MergeStringAlternately1768 {
	public static String canAdd(String str1,String str2)
	{
		char[] chars1=str1.toCharArray();
		char[] chars2=str2.toCharArray();
		int length=Math.min(str1.length(), str2.length());
		StringBuilder result=new StringBuilder();
		for(int i=0;i<length;i++)
		{
			result.append(chars1[i]).append(chars2[i]);
		}
			
			if(str2.length()>str1.length())
			{

				result.append(str2.substring(length));
			}
			else if(str1.length()>str2.length())
			{
				result.append(str1.substring(length));
			}
			
		
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=canAdd("ab","pqrs");
		System.out.println(s);

	}

}
