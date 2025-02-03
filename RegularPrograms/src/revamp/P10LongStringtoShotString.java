package revamp;

public class P10LongStringtoShotString {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="r7v4b3f2d5";
		StringBuilder output =new StringBuilder();
		for(int i=0;i<name.length();i++)
		{
			char character=name.charAt(i);
			if(Character.isLetter(character))
			{
				int count=Character.getNumericValue(name.charAt(++i));
				for(int j=0;j<count;j++)
				{
					output.append(character);
				}
			}
		}
		System.out.println(output.toString());

	}

}
