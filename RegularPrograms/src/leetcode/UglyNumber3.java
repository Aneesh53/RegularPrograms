package leetcode;

import java.util.ArrayList;
import java.util.List;

public class UglyNumber3 {
	
	public static void numbercheck(int n) {
		List<Integer>list=new ArrayList<>();
		
		while(n%2==0)
		{
			n=n/2;
		}
		while(n%3==0)
		{
			n=n/3;
		}
		while(n%5==0)
		{
			n=n/5;
		}
		
		

		System.out.println(list);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbercheck(14);
		
	}

}
