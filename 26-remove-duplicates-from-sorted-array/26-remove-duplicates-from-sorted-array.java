class Solution {
    public int removeDuplicates(int[] arr) 
    {
        int c=1;
        for(int x=1;x<arr.length;x++)
        {
            if(arr[x]!=arr[x-1])
            {
                arr[c++]=arr[x];
            }
        }
        return c;
    }
}