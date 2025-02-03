package revamp;

import java.util.HashSet;
import java.util.Set;

public class P6DuplicateElementsInArrray {
	public static void main(String[] args) {
		int array[]= {3,4,5,4,6,5,4,5,4,7,5,6,85,2,4,2,6,35,3,2,4,2,5,23,6,52,44,52,5,2,3,6,52,552,55,41,24,5};
		String names[]= {"abc","bcd","cde","efg","fgh","avs","abc"};
		
		Set<Integer> set=new HashSet<>();
		Set<String> name=new HashSet<>();
		for(int i=0;i<array.length;i++)
		{
			set.add(array[i]);
		}
		for(int i=0;i<names.length;i++)
		{
			name.add(names[i]);
		}
		
		System.out.println(set);
		System.out.println(name);
		   String array1[]={"abc","bcd","cde","def","efg","fgh","ghi"};
	        String array2[]={"aneesh","ballon","abc","great","def","gained","cde"};
	        for(int i=0;i<array1.length;i++)
	        {
	            for(int j=0;j<array2.length;j++)
	            {
	                if(array1[i].equals(array2[j]))
	                {
	                    System.out.print(array1[i]+" ");
	                }
	            }
	        }
	}
	

}
