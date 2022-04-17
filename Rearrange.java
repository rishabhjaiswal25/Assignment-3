package assignment_3;

import java.util.Scanner;

public class Rearrange {
	
	static void customSort(int[] arr, int k) {
		int[] positive = new int[k];
		int[] negitive = new int[k];
		
		int p = 0;
		int n = 0;
		
		for(int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				negitive[n] = arr[i];
				n++;
			} else {
				positive[p] = arr[i];
				p++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(negitive[i] + "\t");
		}
		
		for(int i = 0; i < p; i++) {
			System.out.print(positive[i] + "\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		customSort(arr, n);
	}

}
