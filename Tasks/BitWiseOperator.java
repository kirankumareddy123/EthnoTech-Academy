//Write a program for BitWise Operator
//Those who are getting 250-Units PowerBill,they dont need to pay charge.
//For those who are above limit units then need to pay and with 1 Unit=1 cost...
import java.util.*;
class BitWiseOperator
{
	public static void main(String args[])
	{
		//Dynamic User Input()
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=350;
		int b=450;
		int limit=250;
		int cost1=0;
		int cost2=0;
		if(n>=limit||m>=limit)
		{
			cost1=n-limit;
			cost1=cost1/50;
			cost1=0^(cost1*50);
			cost2=m-limit;
			cost2=cost2/50;
			cost2=0^(cost2*50);
		}
		System.out.println("cost1:"+cost1);
		System.out.println("cost2:"+cost2);
		
		//Static Method
		int lim=250;
		int ca=0;
		int cb=0;
		if(a>=lim||b>=lim)
		{
			ca=a-lim;
			ca=ca/50;
			ca=0^(ca*50);
			cb=b-lim;
			cb=cb/50;
			cb=0^(cb*50);
		}
		System.out.println("costA:"+ca);
		System.out.println("costB:"+cb);
	}
}