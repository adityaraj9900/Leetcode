class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int vd= Math.abs(sy-fy);
        int hd=Math.abs(sx-fx);
        if (vd==0&&hd==0&&t==1){
            return false;
        }
        return t>=Math.max(vd,hd); 
    }
}