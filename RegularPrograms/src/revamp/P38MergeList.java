package revamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P38MergeList {
	
	public static void WordFinder(String str,String prefix,List<String> list)
	{
		
		
		if(str.length()==0)
		{
			list.add(prefix);
			if(list.contains("POORNA"))
			{
				System.out.println(list.contains("POORNA"));
			}
			System.out.println(prefix);
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				WordFinder(str.substring(0,i)+str.substring(i+1), prefix+c,list);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<>();
		list.add(1);list.add(2);list.add(3);
		List<Integer>list2=new ArrayList<>();
		list2.add(4);list2.add(5);list2.add(6);
		list.addAll(list2);
		List<String> list5= new ArrayList<>();
		WordFinder("OOPRNA","",list5);
		System.out.println(list);
		

	}

}
