package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class MaximumElementfFromVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<>();
		LinkedList<String>l1=new LinkedList<>();
		l1.add("Aneesh");
		l1.add("Kumar");
		l1.add("Chowdary");
		l1.add("veluru");
		for(int j=0;j<l1.size();j++)
		{
			System.out.println(l1.get(j));
		}
		for(int i=0;i<1000;i+=2)
		{
			v.add(i);
		}
		int n=Collections.max(v);
		int index=Collections.binarySearch(v,338);
		System.out.println(index);
		System.out.println(n);
	}

}
