package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelativeRanks506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,3,8,9,4};
		String[] result=new String[array.length];
		List<Integer>list=new ArrayList<>();
		for(int num:array)
		{
			list.add(num);
		}
		Collections.sort(list);
		Collections.reverse(list);
		Map<Integer,String>map=new HashMap<>();
		map.put(list.get(0), "Gold Medal");
		map.put(list.get(1), "Silver Medal");
		map.put(list.get(2), "Bronze Medal");
		for(int i=3;i<list.size();i++)
		{
			map.put(list.get(i),Integer.toString(i+1));
		}
		for(int i=0;i<array.length;i++)
		{
			result[i]=map.get(array[i]);
		}
		System.out.println(Arrays.toString(result));
	}

}
