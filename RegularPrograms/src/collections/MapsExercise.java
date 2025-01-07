package collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExercise {

	public static void main(String[] args) {
		Map<String,Integer> student=new HashMap<>();
		student.put("Aneesh", 26);
		student.put("Ravi", 25);
		student.put("naveen", 28);
		student.put("Katich",29);
		student.put("Krunal", 28);
		System.out.println(student.get("naveen"));
		student.replace("naveen",36);
		student.remove("Katich");
		System.out.println(student.containsKey("Ravi"));
		System.out.println(student);
		
		

	}

}
