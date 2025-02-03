package string;

public class FibnocciSeries {
	public static void Printfibnocii(int n)
	{
		int a=0;
		int b=1;
		int c = 0;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+c);
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Printfibnocii(15);
	}

}
