package string;

public class ToProveStringIsImmutable {

	public static void main(String[] args) {
		String original="Hello, World!";
		System.out.println("Orignal Text: "+original);
		
		String modified= original.concat("Welcome To Java");
		System.out.println("Original string after modification attempt: " + original);
		System.out.println("Modified string: " + modified);
		if (original.equals("Hello, World!")) {
			System.out.println("The original string is unchanged, proving that strings are immutable.");
			} 
		else { 
			System.out.println("The original string has changed.");
			}
	}

}
