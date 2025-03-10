package leetcode;

public class NimGame7 {
	public static boolean canIwin(int n)
	{
		if(n<=3)
		{
			return true;
		}
		else if(n%4==0)
		{
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canIwin(8));

	}

}
