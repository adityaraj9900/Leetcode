class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n=dist.length;
        int[] a=new int[n]; 
        for (int i=0;i<n;i++){
            a[i]=(int) Math.ceil((double)dist[i]/speed[i]);
        }
        Arrays.sort(a);
        int count=1;
        int timePassed=1;
        for (int i=1;i<n;i++){
            if (a[i]-timePassed<=0){
                return count;
            }        
            count++;
            timePassed++;
        }  
        return count; 
    }
}