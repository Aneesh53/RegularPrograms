package string;

public class RemoveLeadingZero {

	public static void main(String[] args) {
		
		        String input = "0001234";
		        String result = input.replaceFirst("^0+(?!$)", "");
		        System.out.println(result); // Output will be: 1234
		    }
		}


