package revamp;

public class P17CommonPrefixInString {
	
	
	public static String commonprefix(String[] str)
	{
		String prefix=str[0];
		for(int i=0;i<str.length;i++)
		{
			while(str[i].indexOf(prefix)!=0)
			{
				prefix=prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty())
				{
					return "";
				}
			}
		}
		return prefix;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[]= {"aneesh","anehil","anegtow"};
		String st=commonprefix(strs);
		System.out.println(st);

	}

}
