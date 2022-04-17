import java.util.*;
class ChocaltesSharing	
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++)   
		{  
			System.out.println(arr[i]);  
		}
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		if(sum % n == 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
