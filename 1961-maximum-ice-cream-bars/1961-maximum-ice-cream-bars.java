class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        for (int i=0;i<costs.length;i++){
            max=Math.max(max,costs[i]);
        }
        int[] count=new int[max+1];           //use counting sort
        for (int i=0;i<costs.length;i++){
            count[costs[i]]++;
        }
        int result=0;
        int remainingcoins=coins;
        for (int cost=1;cost<=max;cost++){
            while (count[cost]>0&&remainingcoins>=cost){
                count[cost]--;
                remainingcoins-=cost;
                result++;
            }
        }
        return result;
    }
}