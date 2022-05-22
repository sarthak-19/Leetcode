class Solution  {
    public void setZeroes(int[][] matrix) 
    {
        int r=matrix.length;
        int c=matrix[0].length;
        
        boolean firstCol = false;
        boolean firstRow = false;
        
        for(int i=0; i<matrix.length; i++)
        {
            if(matrix[i][0] == 0){
                firstCol = true;
                break;
            }
        }
        for(int i=0; i<matrix[0].length; i++)
        {
            if(matrix[0][i] == 0){
                firstRow = true;
                break;
            }
        }
        
        
        for(int x=0;x<r;x++)
        {
            for(int y=0;y<c;y++)
            {
                if(matrix[x][y]==0)
                {
                    matrix[x][0]=0;//left
                    matrix[0][y]=0;//up
                }
            }
        }
        for(int x=1;x<r;x++)
            for(int y=1;y<c;y++)
            {
                if(matrix[x][0]==0 || matrix[0][y]==0)
                {
                    matrix[x][y]=0;
                }
            }
        
        if(firstCol)
        {
            for(int x=0;x<r;x++)
            {
                matrix[x][0]=0;
            }
        }
        if(firstRow)
        {
            for(int x=0;x<c;x++)
            {
                matrix[0][x]=0;
            }
        }
    }
}