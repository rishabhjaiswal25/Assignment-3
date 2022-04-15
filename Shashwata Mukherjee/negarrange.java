package Assignment3;
import java.util.*;
public class negarrange {

	public static void main(String[] args) {
		int n,i,f,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of integers in array:  ");
		n=sc.nextInt();
		System.out.println("Enter integers in array:  ");
		int[] a=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++){
				if(a[i]>0 && a[j]<0) {
					f=a[i];
					a[i]=a[j];
					a[j]=f;
				}
			}
		}
		System.out.println(" The array after arrangement ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
