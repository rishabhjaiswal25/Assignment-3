package assignment_3;
import java.util.Scanner;
public class Rohit_assignment_3_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Arun Dice Choice:");
		int[] a=new int[10];
			for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
			System.out.println("Naveen Dice Choice:");
		int[] n=new int[10];
	
		for(int i=0;i<10;i++) {
			n[i]=sc.nextInt();
		}
		int temp1=0;
		int temp2=0;
		for(int i=0;i<10;i++) {
			temp1+=a[i];
			temp2+=n[i];
		}
		if(temp1<temp2) {
			System.out.println("Arun Wins");
		}
		else if(temp1>temp2){
			System.out.println("Naveen Wins");
		}
		else {
			System.out.println("Draw");
		}
	}
}
