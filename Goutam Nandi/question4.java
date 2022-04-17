package assignment_3;

import java.util.*;
public class question4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,sum1=0;
		
		int []a=new int[10];
		int []b=new int[10];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the dice value of Arun: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("enter the dice value of Naveen: ");
		
		for(int i=0;i<10;i++)
		{
			b[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<10;i++)
		{
			sum=sum+a[i];
			sum1=sum1+b[i];
		}
		if(sum>sum1)
		{
			System.out.println("Arun Wins..");
		}
		else if(sum<sum1)
		{
			System.out.println("Naveen Wins..");
		}
		else {
			System.out.println("Draw");
		}
	}

}
