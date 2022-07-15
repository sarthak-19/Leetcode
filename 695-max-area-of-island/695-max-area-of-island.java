class Solution
{
    int area;
    public int maxAreaOfIsland(int[][] grid) 
    {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    area=0;
                    dfs(grid,i,j,n,m);
                    ans=Math.max(ans,area);    
                } 
            }
        }
        return ans;
        
    }
    public void dfs(int[][] grid,int i,int j,int n, int m)
    {
        area=area+1;
        grid[i][j]=0;
        if(isValid(grid,i+1,j,n,m))
        {
            dfs(grid,i+1,j,n,m);
        }
        if(isValid(grid,i-1,j,n,m))
        {
            dfs(grid,i-1,j,n,m);
        }
        if(isValid(grid,i,j+1,n,m))
        {
            dfs(grid,i,j+1,n,m);
        }
        if(isValid(grid,i,j-1,n,m))
        {
            dfs(grid,i,j-1,n,m);
        }
    }
    public boolean isValid(int[][] grid,int i,int j, int n, int m)
    {
        if(i>=0 && i<n && j>=0 && j<m && grid[i][j]==1)
        {
            return true;
        }
        return false;
    }
}