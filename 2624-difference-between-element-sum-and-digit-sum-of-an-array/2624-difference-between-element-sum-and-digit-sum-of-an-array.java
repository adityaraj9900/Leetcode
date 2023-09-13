class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,digisum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]>=10){
                while(nums[i]>0){
                    digisum+=nums[i]%10;
                    nums[i]/=10;
                }
            }
            digisum+=nums[i];
        }
        return sum-digisum;
    }
}