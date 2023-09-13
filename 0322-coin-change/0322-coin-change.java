class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 0;
        }
for (int j = 1; j <= amount; j++) {
            dp[0][j] = amount + 1;
        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i - 1]] + 1);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int result;
        if (dp[coins.length][amount] > amount) {
            result = -1; // It's not possible to make up the amount with the given coins.
        } else {
            result = dp[coins.length][amount]; // The minimum number of coins needed to make up the amount.
        }
        return result;
    }
}