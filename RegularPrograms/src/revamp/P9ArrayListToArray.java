package revamp;

import java.util.ArrayList;

public class P9ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aneesh");
		list.add("anedesh");
		list.add("andeesh");
		list.add("anedesh");
		list.add("avneesh");
		list.add("aneeshi");
		list.add("aneeshe");
		String myarray[]=  new String[list.size()];
		list.toArray(myarray);
		for(String name:myarray)
		{
			System.out.println(name);
		}
	}

}
