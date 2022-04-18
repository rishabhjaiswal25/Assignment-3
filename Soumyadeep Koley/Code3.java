import java.util.*;
public class Code3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no of elements:");		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}	
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("sorted elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
