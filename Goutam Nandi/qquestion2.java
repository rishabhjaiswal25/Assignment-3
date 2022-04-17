package assignment_3;
import java.util.*;

public class qquestion2 {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("enter the Number of Friends:");
		Scanner sc=new  Scanner(System.in);
		int a[]=new int[100];
		int n=sc.nextInt();
		System.out.println("enter the no of chocolates:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		if(sum%n==0)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
	

}
