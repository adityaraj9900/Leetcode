class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int pehla=cost[0];
        int dusra=cost[1];
        for(int i=2;i<n;i++){
            int curr=cost[i]+Math.min(pehla,dusra);
            pehla=dusra;
            dusra=curr;
        }
        return Math.min(pehla,dusra);
    }
}