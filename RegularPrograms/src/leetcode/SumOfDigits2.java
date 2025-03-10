package leetcode;

public class SumOfDigits2 {
	    public static int addDigits(int n) {
	        while (n >= 10) { // Repeat until single digit
	            int sum = 0;
	            while (n > 0) {
	                sum += n % 10; // Extract last digit and add to sum
	                n /= 10;       // Remove last digit
	            }
	            n = sum; // Update n with the new sum
	        }
	        return n;
	    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(256987));

	}

}
