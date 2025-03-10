package revamp;

public class P33FactorialNumber {
	public static void reverseNumber(int sol)
	{
		int reverse=0;
		while(sol>0)
		{
			int digit=sol%10;
			reverse=reverse*10+digit;
			sol=sol/10;
		}
		System.out.println("Reverse: "+reverse);
	}
	public static void fibnocciSeries(int n) {
		int a=0,b=1,c=a+b;
		for(int i=0;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+c);
		}

	}
	public static void timberlake(int n) {
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
	
		int num=10;
		int sol=1;
		for(int i=1;i<=num;i++)
		{
			sol=sol*i;
		}
		fibnocciSeries(num);
		reverseNumber(sol);
		System.out.println(sol);
		timberlake(4444);
	}

}
