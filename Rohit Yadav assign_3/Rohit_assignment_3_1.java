package assignment_3;
import java.util.Scanner;
public class Rohit_assignment_3_1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to make that size of array ");
		int siz=sc.nextInt();
		System.out.println("Enter elements for each array ");
		int ele=sc.nextInt();
		int a[]=new int[siz];
		int dubCount=1;
		
		for(int i=0; i<siz-1; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<siz-1; i++)
		{
			for(int j=i+1; j<siz; j++)
			{
				if(a[i]==a[j])
				{
					dubCount=dubCount+1;
					break;
				}
			}
		
		}
		System.out.println("No. of duplicate elements: "+dubCount);
		int uniCount=0;
		for(int i=1;i<siz-1;i++)
		{
			for(int j=1;j<siz-1;j++)
			{
				if(a[i]==a[j])
				{
					uniCount=uniCount+1;
					break;
				}
			}
			
		}
		System.out.println("No.of unique elements: "+uniCount);
}
	}


