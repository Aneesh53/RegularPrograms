package leetcode_medium;

public class ReverseInteger7 {
	public static int reverse(int x)
	{
		if(x>=Integer.MAX_VALUE || x<=Integer.MIN_VALUE)
		{
			return 0;
		}
		int number=x;
		int rev=0;
		while (x>0)
		{
			int digit=x%10;
			rev=rev*10+digit;
			x=x/10;
		}
		int result=rev*(number<0?-1:1);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub''
		int ns=reverse(123456789);
		System.out.println(ns);

	}

}
