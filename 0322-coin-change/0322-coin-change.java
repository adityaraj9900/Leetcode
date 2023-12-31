class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for (int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for (int j=0;j<amount+1;j++){
            dp[0][j]=amount+1;
        }
        for (int i=1;i<n+1;i++) {
            for (int j=1;j<amount+1;j++) {
                if (coins[i-1]<=j) {
                    dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int result;
        if (dp[n][amount]>amount) {
            result=-1;
        }else{
            result=dp[n][amount]; 
        }
        return result;
    }
}