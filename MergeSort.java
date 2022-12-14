import java.util.*;
class MergeSort
{
	public void merge(int[] arr, int l, int m, int r)
	{
		int s1 = m-l+1;
		int s2 = r-m;
		int[] left = new int[s1];
		int[] right = new int[s2];
		for(int i = 0; i<s1; i++)
			left[i] = arr[l+i];
		for(int j = 0; j<s2; j++)
			right[j] = arr[m+1+j];
		
		int i = 0, j = 0;
		int k = l;
		while(i < s1 && j < s2)
		{
			if(left[i]<=right[j])
			{
				arr[k] = left[i];
				i++;
			}
			else
			{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<s1)
		{
			arr[k] = left[i];
			i++; k++;
		}
		while(j<s2)
		{
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	public void sort(int[] arr, int l, int r)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			sort(arr, l, m);
			sort(arr, m+1, r);
			merge(arr, l, m, r);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, n-1);
		for(int i = 0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}