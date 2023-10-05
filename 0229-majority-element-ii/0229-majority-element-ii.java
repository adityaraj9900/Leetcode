class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length; 
        ArrayList<Integer> ans= new ArrayList<>(); 
        HashMap<Integer,Integer> mp=new HashMap<>();
        int min=(n/3)+1;  
        for (int i=0;i<n;i++){
            int value=mp.getOrDefault(nums[i],0);
            mp.put(nums[i],value+1);
            if (mp.get(nums[i])==min) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}