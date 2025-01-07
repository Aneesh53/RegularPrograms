package string;

public class SwapStringUsingTempVariable {

	public static void main(String[] args) {
		String string1="aneesh";
		String string2="kumar";
		String temp;
		temp=string1;
		string1=string2;
		string2=temp;
		System.out.println(string1);
		System.out.println(string2);
	}

}
