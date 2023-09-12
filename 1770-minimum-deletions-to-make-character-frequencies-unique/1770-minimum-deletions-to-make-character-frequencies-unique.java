class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){  //count frequency of each letter
            int count=s.charAt(i)-'a';
            freq[count]++;
        }
        HashSet<Integer> st=new HashSet<>();
        int ans=0; 
        for(int i=0;i<26;i++){
            while(freq[i]!=0&&!st.add(freq[i])){
                freq[i]--;
                ans++;
            }
        }
        return ans;
    }
}