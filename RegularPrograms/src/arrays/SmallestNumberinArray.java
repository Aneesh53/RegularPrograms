package arrays;

public class SmallestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,26,11,36,2,15,24,43,6,5,4,7,8,9,7,56,2,4,85,5};
		int min=arr[0];
		for(int num:arr)
		{
			if(num<min)
				min=num;
		}
		System.out.println("The smallest Number in the array is: "+min);

	}

}
