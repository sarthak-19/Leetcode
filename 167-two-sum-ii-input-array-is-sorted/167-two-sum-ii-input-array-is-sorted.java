class Solution {
    public int[] twoSum(int[] arr, int target) 
    {
        int start=0;
        int end=arr.length-1;
        int ans[]={-1,-1};
        while(start<end)
        {
            int sum=arr[start]+arr[end];
            if(sum==target)
            {
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;
            }
            else if(sum>target)
            {
                end--;
            }
            else 
            {
                start++;
            }
        }
        return ans;
    }
}