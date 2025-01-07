package arrays;

public class SumOfItemsInArrays {
	public static void main(String[] args) {
	int arr[]= {14,26,11,36,2,15,24,43,6,5,4,7,8,9,7,56,2,4,85,5};
	int sum=0;
	for(int num:arr)
	{
		sum=sum+num;
	}

	System.out.println("The sum of this array is: "+sum);
	}
}
