class Solution {
    public int largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);
        int ans=0;
        for(int x=0;x<=nums.length-3;x++)
        {
            if(nums[x]+nums[x+1]>nums[x+2])
            {
                ans=Math.max(ans,nums[x]+nums[x+1]+nums[x+2]);
            }
        }
        return ans;
    }
}