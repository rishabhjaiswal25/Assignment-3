package assignment_3;

import java.util.Scanner;

public class Chocolates {

	public static void main(String[] args) {
		
		int n,i,j,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("no of friends :");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter no of chocolates each have ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		float f = (float)sum/n;
		double k = Math.ceil(f);
		if(f-k==0) {
			System.out.print("Yes");
		}
		else {
			System.out.println("No");
		}
		
		

	}

}
