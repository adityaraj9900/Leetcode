class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        Arrays.sort(stones);
        for(int i=n-1;i>0;i--){
            int a=stones[i];
            int b=stones[i-1];
            stones[i-1]=Math.abs(a-b);
            Arrays.sort(stones,0,i);
        }
        return stones[0];
    }
}