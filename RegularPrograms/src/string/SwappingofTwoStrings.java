package string;

public class SwappingofTwoStrings {
	public static void main(String[] args) {
		
	
	String one="Aneesh";
	String two="kumar";
	one=one+two;
	System.out.println(one);
	two=one.substring(0,one.length()-two.length());
	System.out.println(two);
	one=one.substring(two.length());
	System.out.println("The one is: "+one);
	System.out.println("The two is: "+two);
	}
	
}
