// Write a java program for product of array except self
import java.util.*;
class ProductofSelfArray
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
		int result[]=new int[arr.length];
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			int product=1;
			for(int j=i+1;j<n;j++)
			{
				product*=arr[j];
			}
			result[i]=product;
			
		}
		for(int i=n-1;i>0;i--)
		{
			for(int j=i;j>0;j++)
			{
				result[i]*=arr[j];
			}
		}
		for(int ele:result)
		{
			System.out.print(ele+" ");
		}
		/*
		int l=0;
		int r=arr.length;
		int product=1;
		while(l<r)
		{
			result[l--]=arr[l+1]*product;
		}*/
    }
}