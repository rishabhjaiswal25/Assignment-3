import java.util.Scanner;
public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Size, i, j,un = 0, dup_count = 0,un_count=0;
		
		sc = new Scanner(System.in);
		
		System.out.print("Enter  Array size  : ");
		Size = sc.nextInt();
		
		int[] Dup_Count_arr = new int[Size];
		int[] Un_Count_arr = new int[Size];
		
		System.out.format("\nArray  elements are: ", Size);
		for(i = 0; i < Size; i++) 
		{
			Dup_Count_arr[i] = sc.nextInt();
		}
		
		for(i = 0; i < Size; i++) 
		{
			for(j = i + 1; j < Size; j++)
			{
				if(Dup_Count_arr[i] == Dup_Count_arr[j]) {
					dup_count++;
					break;
				}
			}
		}
		for(i = 0; i < Size; i++) 
		{
			for(j = i + 1; j < Size; j++)
			{
				if(Un_Count_arr[i] == Un_Count_arr[j]) {
					un_count++;
					un=un_count-1;
					break;
				}
			}
		}
		
		System.out.println("\nNo of Duplicate elements  = " + dup_count);
		System.out.println("\nNo of Unique elements  = " + un);
	}
}
