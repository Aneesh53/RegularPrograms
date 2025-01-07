package collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExercise2 {

	public static void main(String[] args) {
	Map<String,String> data= new HashMap<>();
	data.put("India", "Delhi");
	data.put("Australia", "Canbera");
	data.put("SriLanka","Columbo");
	data.put("Thailand", "Bangakok");
	data.put("Canada", "Ohio");
	for(Map.Entry<String,String> empty:data.entrySet())
	{
		System.out.println("Country Name is: "+empty.getKey()+" and its capital is: "+empty.getValue() );
	}
	
	}

}
