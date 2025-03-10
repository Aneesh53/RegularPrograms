package leetcode;

public class Twopower_1 {
	
	public static boolean raiseofPower(int n)
	{
		if(n==1)
		{
			return true;
		}
		//boolean found=Math.po
		int count=0;
		while(n>1)
		{
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
