package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Map<Integer,String>map=new HashMap<>();
		map.put(0, "0");
		for(int i=1;i<=n;i++)
		{
			int num=i;
			String str="";
			while(num>0)
			{
				str=num%2+str;
				num=num/2;
			}
			map.put(i, str);
		}
		Map<Integer,Integer> bincount=new HashMap<>();
		int array[]=new int[n+1];
		array[0]=0;
		for(Map.Entry<Integer, String>entry:map.entrySet())
		{

				int Key=entry.getKey();
				int count=0;
				String str=entry.getValue();
				for(int i=0;i<=str.length()-1;i++)
				{
					if(str.charAt(i)=='1')
					{
						count++;
					}
				}
				array[Key] = count;
				bincount.put(Key, count);
				
		}
		//System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array));
		System.out.println(bincount);
		
		
	}

}
