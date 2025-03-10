package leetcode;

import java.util.HashMap;
import java.util.Map;

public class StudentAttedendanceRecord551 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String code="PPALLLP";
		char[] chars=code.toCharArray();
		int count=0;
		for(char c :chars)
		{
			if(c=='A')
			{
				count++;
				if(count>2)
				{
					System.out.println("failed");
				}
			}
		}
		if(code.contains("LLL"))
		{
			System.out.println("Failed");
		}
		
	}

}
