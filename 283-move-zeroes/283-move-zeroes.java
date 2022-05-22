class Solution {
    public void moveZeroes(int[] nums) 
    {
        int c=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]!=0)
            {
                int temp=nums[c];
                nums[c]=nums[x];
                nums[x]=temp;
                c++;
            }
        }
    }
}