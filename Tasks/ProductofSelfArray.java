// Write a java program for product of array except self
import java.util.*;
class Product
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]= s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int p=1;
            for(int j=0;j<n;j++)
            {
                if(j==i)
                continue;

                p*=arr[j];
            }
        System.out.print(p+" "); 
        }
    }
}