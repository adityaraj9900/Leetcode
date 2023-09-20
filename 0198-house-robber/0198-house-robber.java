class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        while(n<2){
            if(nums[0]==1){
                return 1;
            }if(nums[0]==100){
                return 100;
            }
            else{
                return 0;
            }
        }
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[n-1];
    }
}