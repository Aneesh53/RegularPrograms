package revamp;

import java.util.HashSet;
import java.util.Set;

public class P32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=3;
		int c=4;
		int d=5;
		System.out.println(a++);//2
		System.out.println(--b);//2
		System.out.println(++c);//5
		System.out.println(d--);//5
		
		int[] arr= {4, 7, 2, 9, 1, 5, 3, 8, 6, 10, 4, 7, 2, 9, 1, 5, 3, 8, 6, 10, 4, 7, 2, 9, 1};
		Set<Integer>set=new HashSet<Integer>();
		for(int num:arr)
		{
			set.add(num);
		}
		
		System.out.println(set);


	}

}
