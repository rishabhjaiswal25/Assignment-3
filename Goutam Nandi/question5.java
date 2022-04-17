package assignment_3;
import java.util.*;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your 3X3 matrix values: ");
		Scanner sc=new Scanner(System.in);
		int matrix[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Your 3X3 matrix is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
