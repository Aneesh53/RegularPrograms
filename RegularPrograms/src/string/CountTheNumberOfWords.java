package string;

public class CountTheNumberOfWords {

	public static void main(String[] args) {
		String name1="Count the number of words in a string!";
		char[] characters=name1.toCharArray();
		String[] words = name1.split(" "); // Count the number of words 
		int count = words.length;
		System.out.println(count);
	}

}
