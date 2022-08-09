class Solution {
    public int missingNumber(int[] nums) 
    {
        int xor=0;
        int n=nums.length;
        
        for(int x=0;x<n;x++)
        {
            xor^=x^nums[x];
        }
        return xor^n;
    }
}