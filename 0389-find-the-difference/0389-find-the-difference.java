class Solution {
    public char findTheDifference(String s, String t) {
       int xor=0;
       char[] sc=s.toCharArray();
       char[] tc=t.toCharArray();
       for(char ch:sc){
           xor^=ch;
       } 
       for(char ch:tc){
           xor^=ch;
       } 
       return (char)xor;
    }
}