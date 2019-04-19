package leetCode;

public class Problem_70 {
    public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2; 
        for(int i=4;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-3];
        }
        return dp[n];  
        
    }
    
    public static void main(String args[]) {
    	int n = climbStairs(1000000000);
    	int k = n % (1000000007);
    	System.out.println(n);
    }
}
