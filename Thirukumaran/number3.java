import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		n=sc.nextInt();
		
		int a[]= new int[n];
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the element "+i);
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");	
			
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
					
				}
			}
		}
		
		System.out.println();
				
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
			}
	}
}
