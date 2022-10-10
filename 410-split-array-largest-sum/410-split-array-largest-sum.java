class Solution {
    public int splitArray(int[] nums, int k) 
    {
        int max=Arrays.stream(nums)
            .sum();
        int min=Arrays.stream(nums)
                        .max()
                        .getAsInt();
        int mid=0;
        while(min<=max)
        {
            mid=min+(max-min)/2;
            
            int m=1;
            int sum=0;
            int ans=0;
            for(int x=0;x<nums.length;x++)
            {
                 if(sum+nums[x]>mid)
                 {
                     ans=Math.max(ans,sum);
                     sum=nums[x];
                     m++;
                 }
                else
                {
                    sum+=nums[x];
                    
                }
            }
            if(m<=k)
            {
                max=mid-1;
            }
            else
            {
                min=mid+1;
            }
        }
        return min;
    }
}