package leetcode;

import java.util.Arrays;

public class ReverseString9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"h","e","l","l","o"};
		int left=0;
		int right=str.length-1;
		while(left<right)
		{
			String temp=str[left];
			str[left]=str[right];
			str[right]=temp;
			left++;
			right--;
		}
		
		
		
		System.out.println(Arrays.toString(str));
	
	}

}
