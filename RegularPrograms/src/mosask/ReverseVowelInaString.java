package mosask;

public class ReverseVowelInaString {

	/*
	 * Let the String be aneesh
	 */
	
	public static String reverse(String s)
	{
		char[] chars=s.toCharArray();
		String vowels="aeiouAEIOU";
		int left=0;
		int right=chars.length-1;
		while(left<right)
		{
			if(vowels.indexOf(chars[left])!=-1 &&  vowels.indexOf(chars[right])!=-1)
			{
				char temp= chars[left];
				chars[left]=chars[right];
				chars[right]=temp;
				left++;
				right--;
			}
			else
			{
				if(vowels.indexOf(chars[left])==-1)
				{
					left++;
				
				}
				if(vowels.indexOf(chars[right])==-1)
				{
					right--;
				}
			}
			
		}
		return new String(chars);

	}
	public static void main(String[] args) {
		System.out.println(reverse("smartie"));

	}

}
