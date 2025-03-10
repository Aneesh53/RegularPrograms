package leetcode;

public class DetectCapital520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Amazon";
		char[] chars=word.toCharArray();
		int i=1;
		for(char c:chars)
		{
			if(Character.isUpperCase(0) && !Character.isUpperCase(i))
			{
				System.out.println("Aneesh");
			}
			else if(Character.isUpperCase(c))
			{
				System.out.println("works");
			}
			else if(Character.isLowerCase(c))
			{
				System.out.println("works");
			}
				
		}

	}

}
