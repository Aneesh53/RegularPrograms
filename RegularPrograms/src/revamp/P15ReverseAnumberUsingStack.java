package revamp;

import java.util.Stack;

public class P15ReverseAnumberUsingStack {
	
	
	public static int reversenumber(int num)
	{
		Stack <Integer>stack= new Stack<>();
		while(num!=0)
		{
			int digit=num %10;
			stack.push(digit);
			num=num/10;
		}
		int reverseNumber=0;
		int place=1;
		while(!stack.isEmpty())
		{
			reverseNumber=reverseNumber+stack.pop()*place;
			place=place*10;
		}		
		return reverseNumber;
	}

	public static void main(String[] args) {
		int  num=917787598;
		int reversed=reversenumber(num);
		System.out.println(reversed);
		
	
		
	}

}
