class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        int[][] dp=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                dp[i][j]=dp[j][i]=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
            }
        }
        int mincost=0;
        boolean[] visit=new boolean[n];
        visit[0]=true;
        for (int i=1;i<n;i++) {
            int minedge=Integer.MAX_VALUE;
            int u=-1;
            for (int j=0;j<n;j++){
                if (visit[j]){
                    for(int k=0;k<n;k++){
                        if(!visit[k]){
                            if(dp[j][k]<minedge) {
                                minedge=dp[j][k];
                                u=k;
                            }
                        }
                    }
                }
            }
            visit[u]=true;
            mincost+=minedge;
        }
        return mincost;
    }
}