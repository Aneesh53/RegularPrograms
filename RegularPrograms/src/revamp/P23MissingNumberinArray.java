package revamp;

public class P23MissingNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {3,0,1};
		int n=array.length+1;
		int totalsum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		int missingNumber=totalsum-sum;
		System.out.println(missingNumber);

	}

}
