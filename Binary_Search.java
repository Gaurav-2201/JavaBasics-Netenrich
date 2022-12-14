import java.util.*;
class Binary_Search
{
	public static void Binary(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last )
		   {  
		      if ( arr[mid] < key )
		      {  
		        first = mid + 1;     
		      }
		      else if ( arr[mid] == key )
		      {  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }
		      else
		      {  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last )
		   {  
		      System.out.println("Element is not found!");  
		   }  
		 }    
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.print("Enter the elements in sorted order: ");
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the key to search: ");
		int key = sc.nextInt();
		Binary(arr, 0, n, key);
		sc.close();
	}
}