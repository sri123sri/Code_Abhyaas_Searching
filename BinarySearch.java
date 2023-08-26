public class BinarySearch
{
    public static int BinSearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length;
        int mid=(start+(end-start))%2;
        while(start<=end)
        {
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;

    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int ans=BinSearch(arr,5);
        System.out.print(ans);
    }
}