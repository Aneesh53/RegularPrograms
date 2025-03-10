package leetcode_medium;

import java.util.ArrayList;
import java.util.List;

public class CheckifNumberisASumofPowerThree1780 {
	
	public static boolean checkPowersOfThree(int n) {
        if(n%3!=0)
        {
            return false;
        }
        String str="";
        while(n>0)
        {
             str=n%3+str;
             n=n/3;
        }
        int sum=0;
        for(int i=str.length()-1;i>=0;i--)
        {
        	if(str.charAt(i)==1)
        	{
        		sum=sum+(int)Math.pow(3, i);
        	}
        }
        System.out.println(sum);
        return true;
    }

	public static void main(String[] args) {
			int n=91;
	        String str="";
	        while(n>0)
	        {
	             str=n%3+str;
	             n=n/3;
	        }
	        int sum=0;
	        for(int i=str.length()-1;i>=0;i--)
	        {
	        	if(str.charAt(i)=='1')
	        	{
	        		sum=sum+(int)Math.pow(3, str.length()-1-i);
	        	}
	        }
	        System.out.println(sum);

	}

}
