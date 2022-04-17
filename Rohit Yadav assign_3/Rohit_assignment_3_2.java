package assignment_3;
import java.util.Scanner;

public class Rohit_assignment_3_2 {

	public static void main(String[] args) {
		double b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of friends ");
		int siz=sc.nextInt();
		double[] a=new double[siz];
		System.out.println("Enter the number of chocolates");
		for(int i=0;i<siz;i++) {
			a[i]=sc.nextDouble();
			b+=a[i];
		}
		double div=b/siz;
		int t=(int)div;
		if(div-t==0) {
			System.out.println("YES it is possible to share chocolates equally ");
		}
		else {
			System.out.println("No");
		}

	}

}
