class Solution {
    public boolean winnerOfGame(String s) {
        int n=s.length();
        int a=0;
        int b=0;
        for(int i=1;i<n-1;i++){
            if(s.charAt(i)=='A'&& s.charAt(i-1)=='A'&&s.charAt(i+1)=='A')
            a++;
            else if(s.charAt(i)=='B'&&s.charAt(i-1)=='B'&&s.charAt(i+1)=='B')
            b++;
        }
        if(a<=b)
        return false;
        else
        return true;
    }
}