package linkedlnPrograms;

public class ConstructorbasedProgram {
	
	public class number{
		int value;
		String name;
		double large;
	
	public number(int value,String name)
	{
		this.value=value;
		this.name=name;
	}
	public number(int value,double large,String name)
	{
		this.value=value;
		this.large=large;
		this.name=name;
	}
	}
	public static void main(String[] args) {
		ConstructorbasedProgram cons=new ConstructorbasedProgram();
		number n1=cons.new number(23,24.56,"avbsbfw");
		System.out.println("Value: " + n1.value + ", Large: " + n1.large + ", Name: " + n1.name);

	}

}
