package leetcode;

public class Base7_504 {
	public static void main(String[] args) {
		
	
	int num=100;
	String str="";
	while(num!=0)
	{
		str=str+num%7;
		num=num/7;
	}
	System.out.println(str);

}
}