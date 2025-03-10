package experience;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Remove2ndLargestElementfromThearray {
	
	
	
	public static void main(String[] args) {
		int array[]= {1,2,3,4,55,65,43,2,323,22,23,45,45,49,56,76,45,76};
		int highestValue=Integer.MIN_VALUE;
		int secondhighestValue=Integer.MIN_VALUE;
		for(int num:array)
		{
			if(num>highestValue)
			{
				secondhighestValue=highestValue;
				highestValue=num;
			}
			else if(num>secondhighestValue && num!=highestValue)
			{
				secondhighestValue=num;
			}
		}
			List<Integer>list=new ArrayList<>();
			for(int num:array)
			{
				if(num!=secondhighestValue)
				{
					list.add(num);
				}
			}
			Collections.sort(list);
			System.out.println(list);
	}

}
