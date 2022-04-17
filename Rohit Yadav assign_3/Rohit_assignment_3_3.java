package assignment_3;
import java.util.Scanner;

public class Rohit_assignment_3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to make that size of array:");
		int num=sc.nextInt();
		System.out.println("Enter the elements for array:  ");
		int[] a=new int[num];
		for(int i=0;i<num;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++){
				if(a[i]>0 && a[j]<0) {
					int s=a[i];
					a[i]=a[j];
					a[j]=s;
				}
			}
		}
		System.out.println(" The final Array after re-arrangement:");
		for(int i=0;i<num;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
