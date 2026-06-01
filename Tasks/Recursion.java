import java.util.Scanner;
class Recursion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=fact(n);
		System.out.println("Factorial of "+n+" is: "+res);
	}
	public static int fact(int n)
	{
		if(n==0)   // if(n==1||n==0)  then we can remove the second condition and return 1 for both cases
		{
			return 1;
		}
		else if(n==1)
		{
			return n;
		}
		else
		{
			return n*fact(n-1);
		}
	}
}