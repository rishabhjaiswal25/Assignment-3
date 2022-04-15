package Assignment3;
import java.util.*;
public class chocodist {

	public static void main(String[] args) {
		int n,i; double s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of friends ");
		n=sc.nextInt();
		double[] a=new double[n];
		System.out.println("Enter Number of chocolates each have ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextDouble();
			s+=a[i];
		}
		double f=s/n;
		int k=(int)f;
		if(f-k==0) {
			System.out.println("Yes ");
		}
		else {
			System.out.println("No ");
		}
		

	}

}
