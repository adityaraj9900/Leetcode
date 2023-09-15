class Solution {
       public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int n=stones.length;
        for(int i=n-1;i>0;i--){
            if(stones[i]-stones[i-1]==0){
                i--;
                stones[i]=0;
            }
            else{
                stones[i-1]=stones[i]-stones[i-1];
            Arrays.sort(stones,0,i);
            if(n==1){
                break;
            }
        } 
        }
        return stones[0];
       }
 }