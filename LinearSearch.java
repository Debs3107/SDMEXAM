import java.util.Scanner;

 class Linear
{
    public static void search(int arr[],int m)
    {
      
        int n = arr.length;
      
        for(int i = 0; i < n; i++)
        {
            if(arr[i]==m)
            {
                System.out.println("Element found at="+i);
            }
        }


    }
}


class BinarySearch {

	int binarySearch(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;

		
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			
			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}
}
    public class LinearSearch{

	public static void main(String args[])
	{
        int arr[] = { 2, 3, 4, 10, 40 };
        
        char ch;
        System.out.println("Enter a choice");
        System.out.println("a.Linear Search");
        System.out.println("b.Binary Search");
        System.out.println("c.exit");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        switch(ch)
        {
        case 'a':
                   Linear.search(arr,4);
                   break;
        case 'b':

		BinarySearch ob = new BinarySearch();
		
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "
							+ result);
                            break;

        case 'c':
                                System.exit(0);
            default:
                System.out.println("Invalid choice");
                break;
        
            }
	}
}


