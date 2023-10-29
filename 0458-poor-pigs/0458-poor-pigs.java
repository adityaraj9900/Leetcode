class Solution {
    public int poorPigs(int buckets, int die, int test) {
        int t=test/die;
        int i=0;
        while(Math.pow(t+1,i)<buckets){
            i++;
        }
        return i;  
    }
}