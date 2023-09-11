class Solution {
    public boolean canJump(int[] nums) {
        int stepcount=1;
        for(int i=0;i<nums.length;i++){
            if(stepcount==0) return false;
            stepcount=Math.max(stepcount-1,nums[i]);
        }
        return true;
    }
}