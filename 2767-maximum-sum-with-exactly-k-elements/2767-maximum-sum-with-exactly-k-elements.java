class Solution {
    public int maximizeSum(int[] nums, int k) {
       int n=nums.length;
       int max=0;
       int ans=0;
       for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);  
        }
        while(k>0){
            ans+=max;
            max=max+1;
            k--;
            }
        return ans;
    }
}