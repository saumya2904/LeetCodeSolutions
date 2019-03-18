package leetCode;

public class Problem_122 {
    public static int maxProfit(int[] prices) {
       int profit =0;
       for (int i =1;i< prices.length ;i++) {
    	   if (prices[i]-prices[i-1]>0) {
    		   profit += (prices[i] - prices[i-1]);
    		
    	   }
       }
       return profit;
    }
    
    public static void main(String args[]) {
    	int[] new1 = new int[]{2,4,1,6,7,3,2,1};
    	 int k = maxProfit(new1);
    	 System.out.println(k);

    }
}
