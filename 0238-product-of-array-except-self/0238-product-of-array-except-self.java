class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int selfkepehle=1;
        int selfkebaad=1;
        for(int i=0;i<n;i++){
            ans[i]=selfkepehle;
            selfkepehle*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[i]*=selfkebaad;
            selfkebaad*=nums[i];
        }
        return ans;
    }
}