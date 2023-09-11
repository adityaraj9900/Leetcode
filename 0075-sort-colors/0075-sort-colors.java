class Solution {
    public void sortColors(int[] nums) {
      int l=0;
      int r=nums.length-1;
      for(int curr=0;curr<=r;curr++){
          if(nums[curr]==0){
              int temp=nums[l];
              nums[l]=nums[curr];
              nums[curr]=temp;
              l++;
          }
          else if(nums[curr]==2){
              int temp=nums[r];
              nums[r]=nums[curr];
              nums[curr]=temp;
              r--;
              curr--;
          }
       }  
    }
}