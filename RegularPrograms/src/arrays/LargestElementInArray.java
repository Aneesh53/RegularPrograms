package arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,2,1,2,3,6,5,4,7,8,9,7,56,2,4,85,5};
		int max=arr[0];
		
		for(int num:arr)
		{
			if(num>max)
			{
				max=num;
			}
		}
		System.out.println("The Largest Number is: "+max);
	}

}
