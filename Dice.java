package assignment_3;

import java.util.Scanner;

public class Dice {
	
	static int calSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rounds = 10;
		
		int[] arun = new int[rounds];
		for(int i = 0; i < rounds; i++) {
			arun[i] = scanner.nextInt();
		}
		int[] naveen = new int[rounds];
		for(int i = 0; i < rounds; i++) {
			naveen[i] = scanner.nextInt();
		}
		
		int s1 = calSum(arun);
		int s2 = calSum(naveen);

		if (s1 < s2) {
			System.out.println("Arun Wins!!!");
		} else if (s1 > s2) {
			System.out.println("Naveen Wins!!!");
		} else {
			System.out.println("Scores are equal!!!");
		}
	}

}
