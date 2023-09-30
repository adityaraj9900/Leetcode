class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3){
            return false;
        }
        Stack<Integer>st=new Stack<>();
        int a=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<a){
                return true;
            }
            while (!st.isEmpty()&&nums[i]>st.peek()){
                a=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}