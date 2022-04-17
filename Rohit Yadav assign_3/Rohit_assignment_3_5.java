package assignment_3;
import java.util.Scanner;
public class Rohit_assignment_3_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size for row ");
		int m=sc.nextInt();
		System.out.println("Enter the size of coloumn ");
		int n=sc.nextInt();
		int[][] a=new int[m][n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			int max=0,min=999999999;
			for(int j=0;j<n;j++) {
				if (a[i][j]>max) {
					max=a[i][j];
				}
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
			System.out.println("The minimum and maximum element of "+(i+1)+"th row is "+min+","+max);
		}
		for(int j=0;j<n;j++) {
			int max=0,min=999999999;
			for(int i=0;i<n;i++) {
				if (a[i][j]>max) {
					max=a[i][j];
				}
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
			System.out.println("The minimum and maximum element of "+(j+1)+"rd column is "+min+","+max);
		}

	}

}
