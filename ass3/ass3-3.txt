
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int n,j,f,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element in array:  ");
		n=sc.nextInt();
		System.out.println("Enter integers element in array:  ");
		int[] a=new int[n];
		for(j=0;j<n;j++) {
			a[j]=sc.nextInt();
		}
		for(j=0;j<n;j++) {
			for(p=j+1;p<n;p++){
				if(a[j]>0 && a[p]<0) {
					f=a[j];
					a[j]=a[p];
					a[p]=f;
				}
			}
		}
		System.out.println(" The array after arrangement ");
		for(j=0;j<n;j++) {
			System.out.print(a[j]+" ");
		}
	}

}