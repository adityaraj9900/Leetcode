class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int num:nums){
            result+=mp.getOrDefault(num,0);
            mp.put(num,mp.getOrDefault(num,0)+1);
        }      
        return result;
    }
}