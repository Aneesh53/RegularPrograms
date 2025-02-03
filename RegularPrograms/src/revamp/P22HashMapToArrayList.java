package revamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P22HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<=40;i++)
		{
			map.put(i, i*i);
		}
		List<Integer> list=new ArrayList<>();
		for(Integer key:map.keySet())
		{
			list.add(key);
		}
		List<Integer> listvalues=new ArrayList<>();
		for(Integer value:map.values())
		{
			listvalues.add(value);
		}
		System.out.println(list);
		System.out.println(listvalues);
		System.out.println(list.addAll(listvalues));
		System.out.println(list);
	}

}
