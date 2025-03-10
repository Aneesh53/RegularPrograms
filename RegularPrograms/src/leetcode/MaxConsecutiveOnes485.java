package leetcode;

public class MaxConsecutiveOnes485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,0,1};
		int maxvalue=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]==1)
			{
				count++;
			}
			else
			{
				if(count>maxvalue)
				{
					maxvalue=count;
				}
				count=0;
			}
				
		}
		System.out.println(maxvalue);
	}

}
