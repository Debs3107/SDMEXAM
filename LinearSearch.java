public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int m=5;
        for(int i = 0; i < n; i++)
        {
            if(arr[i]==m)
            {
                System.out.println("Element found at="+i);
            }
        }


    }
}