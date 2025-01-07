package string;

public class SwaptwoprogramsusingStringBuilder {

	public static void main(String[] args) {
		String string1="Aneesh";
		String string2="kumar";
		StringBuilder bd=new StringBuilder();
		bd.append(string1);
		string1 = string2;
		string2 = bd.toString();
		System.out.println("The string1 is "+string1+ "The string2 is: "+string2);
	}

}
