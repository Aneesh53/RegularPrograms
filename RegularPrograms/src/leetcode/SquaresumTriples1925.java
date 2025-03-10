package leetcode;

public class SquaresumTriples1925 {

    public static void main(String[] args) {
        int n = 5; // Upper limit
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int c = i * i + j * j; // Sum of squares
                int cSquared = (int) Math.sqrt(c); // Square root of the sum

                // Check if cSquared squared equals c and cSquared is within limit
                if (cSquared * cSquared == c && cSquared <= n) {
                    System.out.println(i + " " + j + " " + cSquared);
                }
            }
        }
    }
}

//package leetcode;
//
//public class SquaresumTriples1925 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=i;j<=n;j++)
//			{
//				int c=i*i+j*j;
//				int cSqaured=(int)(Math.sqrt(c));
//				if(cSqaured*cSqaured==c && c<=n)
//				{
//					System.out.println(+i+" "+j+" "+c);
//				}
//				
//			}
//			
//		}
//	}
//
//}
