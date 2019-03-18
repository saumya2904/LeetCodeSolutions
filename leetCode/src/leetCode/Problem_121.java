package leetCode;

public class Problem_121 {
	    public static int maxProfit(int[] prices) {
	    	        int minprice = Integer.MAX_VALUE;
	    	        int maxprofit = 0;
	    	        for (int i = 0; i < prices.length; i++) {
	    	            if (prices[i] < minprice)
	    	                minprice = prices[i];
	    	            else if (prices[i] - minprice > maxprofit)
	    	                maxprofit = prices[i] - minprice;
	    	        }
	    	        return maxprofit;
	    	    } 
	    public static void main(String args[]) {
	    	int[] new1 = new int[]{2,4,1};
	    	 int k = maxProfit(new1);
	    	 System.out.println(k);

	    }
}
