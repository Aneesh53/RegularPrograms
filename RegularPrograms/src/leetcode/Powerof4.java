package leetcode;


public class Powerof4 {
	
	public static boolean canvas(int n)
	{	
		int number=n;
		int count=0;
		while(n%4==0 && n!=0)
		{
			n=n/4;
			count++;
		}
		int solved=(int)Math.pow(4, count)*(number<0 ?-1:1);
		if(solved==number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(canvas(24));
	}

}
