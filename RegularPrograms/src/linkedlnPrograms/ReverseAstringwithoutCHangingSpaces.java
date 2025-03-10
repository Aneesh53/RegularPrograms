package linkedlnPrograms;

public class ReverseAstringwithoutCHangingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Aneesh kumar chowdary veluru".toLowerCase();
		char[] chars=str.toCharArray();
		int left=0;
		int right=chars.length-1;
		while(left<right)
		{
			if(chars[left]==' ')
			{
				left++;
			}
			else if(chars[right]==' ')
			{
				right--;
			}
			else
			{
				char temp=chars[left];
				chars[left]=chars[right];
				chars[right]=temp;
				left++;
				right--;
			}
		}
		String reverse=new String(chars);
		System.out.println(reverse);

	}

}
