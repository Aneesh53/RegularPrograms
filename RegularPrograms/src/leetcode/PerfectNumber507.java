package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=21;
		List<Integer>list=new ArrayList<>();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				list.add(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
