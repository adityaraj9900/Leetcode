class Solution {
    public int longestValidParentheses(String s) {
        int maxlength=0;
        Stack<Integer> st=new Stack<>();
        st.push(-1);   //intialize krenge -1 se
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
            if(st.isEmpty()){
                st.push(i);     //jab ')' ye wala ayega suru me
            }
            else{
                maxlength=Math.max(maxlength,i-st.peek());
            }
            }
        }
        return maxlength;
    }
}               