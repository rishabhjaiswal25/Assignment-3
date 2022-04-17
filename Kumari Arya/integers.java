package assignment3;

import java.util.Scanner;

public class integers 
{
	public static void main(String[] args)
	{
		Scanner sys=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int num=sys.nextInt();
		System.out.println("Enter the integers in array: ");
		
		int A[]=new int[num];
		for(int i=0;i<num;i++)
		{
			A[i]=sys.nextInt();
		}
		int m=0;
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(A[i]>0 && A[j]<0)
				{
					m=A[i];
					A[i]=A[j];
					A[j]=m;
				}
			}
		}
		
		System.out.println("Arranged array: ");
		for(int i=0;i<num;i++)
		{
			System.out.println(A[i]+" ");
		}
	}
}
