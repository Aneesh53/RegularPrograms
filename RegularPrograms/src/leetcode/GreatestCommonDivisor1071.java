package leetcode;

public class GreatestCommonDivisor1071 {
	public static String gcd(String str1,String str2)
	{
		if(!(str1+str2).equals(str1+str2))
		{
			return "";
		}
		int a=str1.length();
		int b=str2.length();
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		int gcdlength=a;
		return str1.substring(0,a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ABCABC";
		String str2="ABC";
		String s=gcd(str1,str2);
		System.out.println(s);
		
		
		
		

	}

}
