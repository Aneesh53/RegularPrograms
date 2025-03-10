package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CanPlaceFlowers605 {
	
	
	public static boolean canplaceflowers(int[] array ,int n)
	{
		int length=array.length;
		int count=0;
		for(int i=0;i<length;i++)
		{
			if(array[i]==0)
			{
				boolean isleft =	(array[i-1]==0) || i==0;
				boolean isRight=	(array[i+1]==0) || i==length-1;
				if(isleft&&isRight)
				{
					array[i]=1;
					count++;
					if(count>=n)
					{
						return true;
					}
					
				}
			}
		}
		return count>=n;
		
	}

	public static void main(String[] args) {
		int[]flowerbed = {1,0,0,0,1};
		int n = 2;
		boolean made=canplaceflowers(flowerbed, n);
		System.out.println(made);

	}

}
