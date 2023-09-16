class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n1=gas.length;
        int n2=cost.length;
        if(n1!=n2) return -1;
        int totalgas=0;
        int totalcost=0;
        int currentgas=0;
        int start=0;
        for(int i=0;i<n1;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            currentgas+=gas[i]-cost[i];
            if(currentgas<0){
                currentgas=0;
                start=i+1;
            }
        }
        if(totalgas>=totalcost){
            return start;
        }
        return -1;
    }
}