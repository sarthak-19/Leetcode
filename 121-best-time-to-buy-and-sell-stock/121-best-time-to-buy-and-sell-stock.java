class Solution {
    public int maxProfit(int[] prices) 
    {
        int p=0;
        int min=Integer.MAX_VALUE;
        for(int x=0;x<prices.length;x++)
        {
            if(prices[x]<min)
            {
                min=prices[x];
            }
            
            p=Math.max(p,prices[x]-min);
        }
        return p;
    }
}