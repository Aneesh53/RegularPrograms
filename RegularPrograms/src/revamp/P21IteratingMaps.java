package revamp;

import java.util.HashMap;
import java.util.Map;

public class P21IteratingMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<Integer,Integer> map=new HashMap<>();
	
	for(int i=0;i<=40;i++)
	{
		map.put(i, i*i);
	}	
	for(Map.Entry<Integer,Integer> entry:map.entrySet())
	{
		System.out.println("the Value of key is: "+entry.getKey()+ " The Value is: "+entry.getValue());
	}
	}
}
