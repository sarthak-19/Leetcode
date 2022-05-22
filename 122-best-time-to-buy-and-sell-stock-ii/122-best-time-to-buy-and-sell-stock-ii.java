class Solution {
    public int maxProfit(int[] prices) 
    {
        int p=0;
        for(int x=0;x<prices.length-1;x++)
        {
            if(prices[x]<prices[x+1])
            {
                p+=prices[x+1]-prices[x];
            }
        }
        return p;
    }
}