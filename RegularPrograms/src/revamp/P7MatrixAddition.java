package revamp;

public class P7MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix1[][]={
						{1,2},
						{3,4}
		};
		int matrix2[][]=
			{
					{5,6},
					{8,9}
					
			};
		int resultmatrix[][]= new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				resultmatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("The result matrix: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(resultmatrix[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
