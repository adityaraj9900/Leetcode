class Solution{
    public int[] searchRange(int[] nums, int target){
        int left=first(nums,target);
        int right=last(nums,target); 
        return new int[]{left,right};
    }
    public int first(int[] nums, int target){
        int index=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }  
            if(nums[mid]==target){
                index=mid;
            }
        } 
        return index;
    }  
    public int last(int[] nums,int target){
        int index=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(high+low)/2;  
            if(nums[mid]<=target){
                low=mid+1;
            }else{
                high=mid-1;
            } 
            if(nums[mid]==target){
                index=mid;
            }
        } 
        return index;
    }
}