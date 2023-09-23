class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(String a,String b)->a.length()-b.length());
        HashMap<String,Integer>mp=new HashMap<>();
        int max=1;
        for(String word:words){
            int currlen=1;
            StringBuilder sb=new StringBuilder(word);
            for(int i=0;i<word.length();i++){
                sb.deleteCharAt(i);
                String prevword=sb.toString();
                currlen=Math.max(currlen,mp.getOrDefault(prevword,0)+1);
                sb.insert(i,word.charAt(i));
            }
            mp.put(word,currlen);
            max=Math.max(max,currlen);
        }
        return max;
    }
}