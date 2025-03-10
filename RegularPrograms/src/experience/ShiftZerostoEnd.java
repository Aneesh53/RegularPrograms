package experience;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShiftZerostoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,0,34,0,9,0,87,0,7,7,0,4,2};
		List<Integer>list=new ArrayList<Integer>();
		for(int num:array)
		{
			list.add(num);
		}
		List<Integer>shifftedzero=new ArrayList<Integer>();
		int i=0;
		for(int num:list)
		{
			if(list.get(i)!=0)
			{
				shifftedzero.add(list.get(i));
			}
			i++;
		}
		while(shifftedzero.size()!=list.size())
		{
			shifftedzero.add(0);
		}
		System.out.println(shifftedzero);
	}

}
