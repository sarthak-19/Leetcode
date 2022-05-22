import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int ans[]=new int[2];
        
        for(int x=0;x<nums.length;x++)
        {
            if(map.containsKey(target-nums[x]))
            {
                ans[0]=x;
                ans[1]=map.get(target-nums[x]);
            }
            map.put(nums[x],x);
        }
        return ans;
    }
}