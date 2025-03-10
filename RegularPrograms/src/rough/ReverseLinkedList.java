package rough;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7,8,9,10,11};
		
		LinkedList<Integer>list=new LinkedList<>();
		for(int num:array)
		{
			list.add(num);
		}
		Collections.reverse(list);
		
	}

}
