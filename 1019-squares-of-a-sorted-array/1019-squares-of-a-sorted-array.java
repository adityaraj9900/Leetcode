class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            ans[count]=nums[i]*nums[i];
            count++;
        }
        Arrays.sort(ans);
        return ans;
    }
}