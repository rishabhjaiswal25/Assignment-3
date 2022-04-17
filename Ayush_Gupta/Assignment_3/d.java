
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Arun Dice Choice ");
	
		int[] Arun=new int[10];
			for(int i=0;i<10;i++) {
			Arun[i]=sc.nextInt();
		}
			System.out.println("Enter Naveen Choice ");
		int[] Naveen=new int[10];
	
		for(int i=0;i<10;i++) {
			Naveen[i]=sc.nextInt();
		}
		int arsum=0,navsum=0;
		for(int i=0;i<10;i++) {
			arsum+=Arun[i];
			navsum+=Naveen[i];
		}
		if(arsum<navsum) {
			System.out.println("Arun Wins!!! ");
		}
		else if(arsum>navsum){
			System.out.println("Naveen Wins!!! ");
		}
		else {
			System.out.println("Draw!!! ");
		}

	}

}