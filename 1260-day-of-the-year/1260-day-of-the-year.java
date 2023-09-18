class Solution {
    public int dayOfYear(String date) {
        int[] dim={0,31,28,31,30,31,30,31,31,30,31,30,31}; //dim=dayinmonth
        String[] d=date.split("-");  
        int y=Integer.parseInt(d[0]);
        int m=Integer.parseInt(d[1]);
        int day=Integer.parseInt(d[2]);
        if((y%4==0&&y%100!=0)||(y%400==0))
            dim[2]=29;  
        int doy=day;
        for(int i=1;i<m;i++){
            doy+=dim[i]; 
        }
        dim[2]=28;
        return doy;
    }
}
