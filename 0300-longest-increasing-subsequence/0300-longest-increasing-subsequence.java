class Solution {
    public int lengthOfLIS(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int x=0;x<nums.length;x++){
            set.add(nums[x]);
        }  
        int nums2[]=new int[set.size()];
        int x=0;
        for(int num:set){
            nums2[x]=num;
            x++;
        }
        Arrays.sort(nums2);
        int n=nums.length;
        int m=nums2.length;
        int dp[][]=new int[n+1][m+1];  
        for(int i=1;i<n+1;i++) {
            for(int j=1;j<m+1;j++){
                if(nums[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
}
