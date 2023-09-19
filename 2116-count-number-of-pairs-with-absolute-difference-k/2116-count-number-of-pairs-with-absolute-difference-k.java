class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int arr[]=new int[101];
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(num-k>=1&&num-k<=100){
                count+=arr[num-k];
            }
            if(num+k>=1&&num+k<=100){
                count+=arr[num+k];
            }
            arr[num]++;
        }
        return count;
    }
}