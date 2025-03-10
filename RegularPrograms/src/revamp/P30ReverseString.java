package revamp;

import java.util.Arrays;

public class P30ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Aneesh".toLowerCase();
		char[] chars=str.toCharArray();
		char[] reverse=new char[str.length()];
		
		System.out.println("The Original String is: "+str);
		for(int i=chars.length-1,j=0;i>=0;i--,j++)
		{
			reverse[j]=chars[i];
			
			
		}
		System.out.println(Arrays.toString(reverse));
		String rev= new String(reverse);
		System.out.println("The Reverse String is: "+rev);

	}

}
