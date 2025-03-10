package revamp;

public class P34ArmstrongNumber {
	public static void armstrong(int number)
	{
		int arm=0,d=number;
		int num;
		while(number>0)
		{
			num=number%10;//153%10
			number=number/10;//153/10
			arm=arm+num*num*num;
		}
		if(arm==d)
		{
			System.out.println("ARMSTRONG NUMBER");
		}
		else
		{
			System.out.println("NOT ARMSTRONG NUMBER");
		}
	}
	
	
	public static void main(String[] args) {
		armstrong(123);
	}
}
