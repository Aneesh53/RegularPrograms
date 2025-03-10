package revamp;

import java.util.ArrayList;
import java.util.List;

public class P24PermutationsofString {
	
	public static boolean found=false;
	static List<String> list=new ArrayList<>();
	private static void permute(String str,String prefix)
	{
		int n=str.length();
		
		if(found)
		{
			return;
		}
		if(prefix.equals("BDAC"))
		{
			System.out.println(prefix);
			 found=true;
			
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				permute(str.substring(0,i)+str.substring(i+1,n),prefix+str.charAt(i));
			}
		}
		if(!found)
		{
			list.add(prefix);
		}
		
	}
	
	public static void main(String[] args) {
		String str="ABCD";
		permute(str,"");
		for(String per:list)
		{
			System.out.println(per);
		}
		
	}
}
