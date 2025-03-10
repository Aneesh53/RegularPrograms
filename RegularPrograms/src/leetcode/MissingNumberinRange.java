package leetcode;

public class MissingNumberinRange {
	
	public static int getNumber(int[] array)
	{	
		//n(n+1)/2
		int n=array.length+1;
		int sum=0;
		for(int num:array)
		{
			sum=sum+num;
		}
		
		int x=(n*(n+1))/2;
		int total=x-sum;
		System.out.println(total);
		return total;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {3,0,1};
		getNumber(array);

	}

}
