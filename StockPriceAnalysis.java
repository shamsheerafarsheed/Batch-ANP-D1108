package ArrayDemo;

public class StockPriceAnalysis {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		int minprice=prices[0],maxprofit=0;
		for(int price:prices)
		{
			if(price<minprice)
				minprice=price;
			else
				maxprofit=Math.max(maxprofit, price-minprice);
			
		}
		System.out.println("Maximum profit:"+maxprofit);
		 System.out.println("Minimum price: " + minprice);
	        //find max

	}

}
