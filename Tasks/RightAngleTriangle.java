//Write a java program for the RightAngleTriangle Star Pattern 
class RightAngleTriangle
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
		}
        
    }
}