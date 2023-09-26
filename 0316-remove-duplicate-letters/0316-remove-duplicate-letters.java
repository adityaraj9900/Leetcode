class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        StringBuilder a= new StringBuilder();
        boolean[] t=new boolean[26];
        int[] l=new int[26];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            l[c-'a']=i;
        }
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int idx=c-'a';
            if(t[idx]) continue;
    while(a.length()>0&&c<a.charAt(a.length()-1)&&l[a.charAt(a.length()-1)-'a']>i){
        t[a.charAt(a.length()-1)-'a']=false;
        a.deleteCharAt(a.length()-1);
    }
        a.append(c);
        t[idx]=true;
        }
        return a.toString();
    }
}
