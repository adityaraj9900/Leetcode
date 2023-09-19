class Solution {
    public int maximizeSum(int[] nums, int k) {
       Arrays.sort(nums);
       int n=nums.length;
       int ans=0;
       int max=nums[n-1];
       while(k>0){
           ans+=max;
           max=max+1;
           k--;
       }
       return ans;
    }
}