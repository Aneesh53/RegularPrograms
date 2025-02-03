package revamp;

import java.util.Arrays;

public class P3RemovingSpecificElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]={222,332,324,543,467,66,5443,34,5,5675,5645,3424,4355,533,345,6667,234,5,56,67,23};
        int index=6;
        for(int i=index;i<array1.length-1;i++)
        {
            array1[i]=array1[i+1];
        }
        System.out.println(Arrays.toString(array1));
    }
	

}
