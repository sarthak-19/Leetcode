class Solution {
    public int missingNumber(int[] nums) 
    {
        int sum=0;
        int n=nums.length;
        for(int x=0;x<nums.length;x++)
        {
            sum+=nums[x];
        }
        
        return (n*(n+1))/2-sum;
    }
}