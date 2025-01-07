package string;

public class FirstLetterofEachword {

	public static void main(String[] args) {
		String name="Aneesh is bad boy but xyz still behind aneesh";
		String[] aneesh=name.split(" ");
		StringBuilder result= new StringBuilder();
		for(String build:aneesh)
		{
			result.append(build.charAt(0));
		}
		System.out.println(result.toString());
			

	}

}
