class Solution {
    public int climbStairs(int n) 
    {
        int ans=1;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int a=1;
        int b=2;
        
        for(int x=3;x<=n;x++)
        {
            ans=a+b;
            a=b;
            b=ans;
        }
        return ans;
    }
}