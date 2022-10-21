class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        if(nums.length==1 || k==0)
        {
            return false;
        }
        HashSet<Integer> window=new HashSet<>();
        
        for(int x=0;x<nums.length;x++)
        {
            if(x>k)
            {
                window.remove(nums[x-k-1]);
            }
            if(!window.add(nums[x]))
                return true;
            
        }
        return false;
    }
}