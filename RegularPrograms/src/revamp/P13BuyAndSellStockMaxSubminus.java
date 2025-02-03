package revamp;

import java.util.Arrays;

public class P13BuyAndSellStockMaxSubminus {

	public static void main(String[] args) {
		int prices[]= {2,3,4,5,6,7,8,9,10,11,12,13,14,2,24,43,35};
		Arrays.sort(prices);
		int minprice=Integer.MAX_VALUE;
		System.out.println(minprice);
		int maxprofit=0;
		for(int price:prices)
		{
			if(price<minprice)
			{
				minprice=price;
			}
			else if(price-minprice>maxprofit)
			{
				maxprofit=price-minprice;
			}
		}
		
		System.out.println(maxprofit);
		
	}

}
