package collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> employee=new HashMap<>();
		employee.put("Aneesh", 50);
		employee.put("Ravi", 55);
		employee.put("naveen", 65);
		employee.put("Katich",72);
		employee.put("Krunal", 65);
		for(Map.Entry<String, Integer> range: employee.entrySet())
		{
			if(range.getValue()>60)
			{
				System.out.println(range.getKey());
			}
			else
			{
				System.out.println(range.getKey());
			}
		}
	}

}
