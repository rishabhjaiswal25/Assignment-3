package assignment3;

import java.util.Scanner;

public class unique_duplicate 
{
	public static void main(String[] args) 
	{
		int count1=0, count2=1;
		Scanner sys=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sys.nextInt();
		System.out.println("Array elements are: ");
		int arr=sys.nextInt();
		int A[]=new int[size];
		
		for(int i=0; i<size-1; i++)
		{
			A[i]=sys.nextInt();
		}
		
		for(int i=0; i<size-1; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(A[i]==A[j])
				{
					count1++;
					break;
				}
			}
		
		}
		System.out.println("No. of duplicate elements: "+count1);
		
		for(int i=1;i<size-1;i++)
		{
			for(int j=1;j<size-1;j++)
			{
				if(A[i]==A[j])
				{
					count2++;
					break;
				}
			}
			
		}
		System.out.println("No.of unique elements: "+count2);
	}
}
