/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) 
    {
        int peak=getPeak(arr);
        //System.out.println("peak ="+peak);
        int firstTry=search(arr,0,peak,target);
        if(firstTry!=-1)
        {
            return firstTry;
        }
        else
        {
            return search(arr,peak,arr.length()-1,target);
        }
           
    }
    public int getPeak(MountainArray arr)
    {
        int start=0;
        int end=arr.length()-1;
        while(start!=end)
        {
            int mid=start+(end-start)/2;
            if(arr.get(mid)<arr.get(mid+1))
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return start;
    }
    public int search(MountainArray arr,int start,int end,int target)
    {
        boolean isInc=arr.get(start)<arr.get(end);
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            int midElement=arr.get(mid);
            if(midElement==target)
            {
                return mid;
            }
            if(isInc)
            {
                if(target>midElement)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            else
            {
                if(target<midElement)
                {
                    start=mid+1;
                    
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}