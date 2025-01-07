package arrays;

import java.util.Arrays;

public class EvenAndOddNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {22,34,43,45,667,665,65,34,66,89,643,623,223,34,33,53,17};
		int even[]=new int[numbers.length];
		int odd[]=new int[numbers.length];
		int i=0;
		int j=0;
		for(int num:numbers)
		{
			if(num/2==0)
			{
				even[i++]=num;
			}
			else
			{
				odd[j++]=num;
			}
				
		}
		System.out.println("The Even Array"+Arrays.toString(even));
		System.out.println("The Odd Array"+Arrays.toString(odd));
	}

}
