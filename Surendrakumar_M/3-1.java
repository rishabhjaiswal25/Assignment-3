package Assignment3;
import java.util.Scanner;

public class Assignment3question1 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Size, i, j,qup = 0, dup_count = 0,qup_count=0;
		
		sc = new Scanner(System.in);
		
		System.out.print("\nPlease Enter  Array size  : ");
		Size = sc.nextInt();
		
		int[] Dup_Count_arr = new int[Size];
		int[] Qup_Count_arr = new int[Size];
		
		System.out.format("\nEnter  Array  elements are : ", Size);
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
				if(Qup_Count_arr[i] == Qup_Count_arr[j]) {
					qup_count++;
					qup=qup_count-1;
					break;
				}
			}
		}
		
		System.out.println("\nNo of Duplicates elements  = " + dup_count);
		System.out.println("\nNo of Unique elements  = " + qup);
	}
}