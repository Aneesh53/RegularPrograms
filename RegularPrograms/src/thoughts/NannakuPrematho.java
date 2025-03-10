package thoughts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NannakuPrematho {
	public static int recursive(int n,int k) {
	   
		if(n==1)
		{
			return 0;
		}
		return(recursive(n-1,k)+k)%n;
		
		// Recursive call with new list
	}
	public static int getNumber(int n)
	{
		List<Integer>list=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			list.add(i);
		}
		int index=0;
		int count=0;
		while(list.size()>1)
		{
			index=(index+1)%list.size();
			list.remove(index);
			count++;
		}
		System.out.println(count);
		return list.get(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println( recursive(100,2)+1);
		System.out.println(getNumber(100));
		System.out.println(2%100);
		
		
	}

}
