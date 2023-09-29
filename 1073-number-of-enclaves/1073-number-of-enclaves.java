class Solution{
    public int numEnclaves(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        for (int i=0;i<rows;i++){
            a(grid,i,0);
            a(grid,i,cols-1);
        }
        for (int j=0;j<cols;j++){
            a(grid,0,j);
            a(grid,rows-1,j);
        }
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    private void a(int[][]grid,int row,int col){
        int rows=grid.length;
        int cols=grid[0].length;
        if (row<0||row>=rows||col<0||col>= cols||grid[row][col]==0){
            return;
        }
        grid[row][col]=0;
        a(grid,row+1,col);
        a(grid,row-1,col);
        a(grid,row,col+1);
        a(grid,row,col-1);
    }
}