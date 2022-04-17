
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int c,i; double s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of friends ");
		c=sc.nextInt();
		double[] a=new double[c];
		System.out.println("Enter Number of chocolates each have ");
		for(i=0;i<c;i++) {
			a[i]=sc.nextDouble();
			s+=a[i];
		}
		double f=s/c;
		int k=(int)f;
		if(f-k==0) {
			System.out.println("Yes it is possible to share equally ");
		}
		else {
			System.out.println("No it is not possible to share equally ");
		}
		

	}

}
