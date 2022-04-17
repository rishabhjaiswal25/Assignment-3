package assignment3;

import java.util.Scanner;

public class chocolate 
{
	public static void main(String[] args)
	{
		double e=0;
		Scanner sys=new Scanner(System.in);
		System.out.println("No. of friends: ");
		int num=sys.nextInt();
		System.out.println("No. of distributed chocolates: ");
		double A[] = new double[num];
		
		for(int i=0;i<num;i++)
		{
			A[i]=sys.nextDouble();
			e+=A[i];
		}
		double total=e/num;
		int m=(int)total;
		if(total-m==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
