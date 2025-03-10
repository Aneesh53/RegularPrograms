package thoughts;

public class DigitCOunter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="anesh123S@#4djhcdv@@nbvbnd*&^";
		char[] chars=str.toCharArray();
		String digit="";
		String alphabetics="";
		String specialcharacter="";
		
		for(char c:chars)
		{
			if (Character.isDigit(c))
			{
				digit=digit+c;
			}
			else if(Character.isLetter(c))
			{
				alphabetics=alphabetics+c;
			}
			else
			{
				specialcharacter=specialcharacter+c;
			}
			
		}
		System.out.println(digit);
		System.out.println(alphabetics);
		System.out.println(specialcharacter);
	}

}
