package revamp;

import java.util.ArrayList;
import java.util.List;

public class P18PosistionofNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,7,7,8,8,10};
		
		int target =8;
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==target)
			{
				list.add(i);
			}
		}
		System.out.println(list);
	}

}
