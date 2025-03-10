package leetcode;

public class Raisepowerof8 {

	public static void main(String[] args) {
		int n=27;
		int number=n;
		int count=0;
		while(n%3==0 && n!=0) 
		{
				n=n/3;
				count++;
		}
		int mains = (int) Math.pow(3, count) * (number < 0 ? -1 : 1);
		System.out.println(mains==number);
	
}
}