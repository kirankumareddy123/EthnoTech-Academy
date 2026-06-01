import java.util.*; 
class JaggedArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int total=0;
            System.out.print("Student :"+(i+1)+"-> "+"[");
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]<=45)
                {
                    System.out.print("Fail:"+arr[i][j]+" ");
                }
                else
                {
                    System.out.print(arr[i][j]+" ");
                }
                total+=arr[i][j];
            }
            System.out.print("]"+" Total: "+total);
            System.out.println();
        
        System.out.println("Avg Marks:"+total/m);
        }
    }
}
