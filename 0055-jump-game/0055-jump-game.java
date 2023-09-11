class Solution {
    public boolean canJump(int[] nums) {
     int maxlength=nums.length-1;//4
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]+i>=maxlength){
                maxlength=i;
            }
        }
        return maxlength==0;
    }
}

