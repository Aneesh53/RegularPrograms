package revamp;

import java.util.ArrayList;
import java.util.Arrays;

public class P8ArraytoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,3,4,5,5,6,4,3,434,34,5,3,4,5,53,5,35,4};
		ArrayList list=new ArrayList(Arrays.asList(array));
		System.out.println(list);
		String array2[]= {"aneesh","kumar","chowdary","velluru","i have to mmake it","i will make it"};
		ArrayList lis= new ArrayList(Arrays.asList(array2));
		System.out.println(lis);

	}
	

}
