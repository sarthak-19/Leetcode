class Solution {
    public int[][] merge(int[][] arr) 
    {
        List<int[]> res=new ArrayList<>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        
        int f=arr[0][0];
        int s=arr[0][1];
        
        for(int[] ar:arr)
        {
            if(ar[0]<=s)
            {
                s=Math.max(s,ar[1]);
            }
            else
            {
                res.add(new int[]{f,s});
                f=ar[0];
                s=ar[1];
            }
        }
        res.add(new int[]{f,s});
        return res.toArray(new int[0][0]);
    }
}