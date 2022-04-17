package Assignment3;
import java.util.Scanner;
public class AssignmentQuestion2 {

public static void main(String[] args) {
	int m,n,x=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students :");
	m=sc.nextInt();
	System.out.println("Enter the size of an array :");
	
	n=sc.nextInt();
	
	int a[]= new int[n];
	
	for(int i=0; i<a.length; i++) {
		System.out.println("Enter the element"+i); 
		a[i]=sc.nextInt();
		
	}
	
	for(int i=0; i<a.length; i++) {
		x=x+a[i];	
	}
	
	if(x%m==0) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
	}

}
