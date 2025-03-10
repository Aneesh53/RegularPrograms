package revamp;

import java.util.LinkedHashMap;
import java.util.Map;

public class P25IntegerToRoman {
	public static String IntToRoman(int num)
	{
		 Map<Integer,String> map=new LinkedHashMap<>();
			map.put(1000, "M");
	        map.put(900, "CM");
	        map.put(500, "D");
	        map.put(400, "CD");
	        map.put(100, "C");
	        map.put(90, "XC");
	        map.put(50, "L");
	        map.put(40, "XL");
	        map.put(10, "X");
	        map.put(9, "IX");
	        map.put(5, "V");
	        map.put(4, "IV");
	        map.put(1, "I");
	        StringBuilder str=new StringBuilder();
	        for(Map.Entry<Integer, String> entry:map.entrySet())
	        {
	        	while(num>=entry.getKey())
	        	{
	        		str.append(entry.getValue());
	        		num-=entry.getKey();
	        	}
	        }
	        return str.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IntToRoman(5005));

	}

}
