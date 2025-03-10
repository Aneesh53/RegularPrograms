package revamp;

public class P35NumberOfDigitsInGivenNumber {

	public static void main(String[] args) {
		long number=12345678910L;
		int count=0;
		while(number>0)
		{
			number=number/10;
			count++;
		}
		System.out.println(count);

	}

}
