package assignment_3;

import java.util.HashMap;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		System.out.print("Enter array size:");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int[] count = new int[n];
		System.out.print("Array elements are :");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
			count[i] = 0;
		}
		
		for(int i = 0; i < n; i++) {
			if(hashMap.containsKey(arr[i])) {
				int cur = hashMap.get(arr[i]);
				hashMap.put(arr[i], cur + 1);
			} else {
				hashMap.put(arr[i], 1);
			}
		}
		
		int unq = 0;
		int dup = 0;
		for(Integer value : hashMap.values()) {
			if (value > 1) {
				dup++;
			} else {
				unq++;
			}
		}
		
		System.out.println("No of duplicate element: " + dup);
		System.out.print("No of unique elements:"+unq);
		
		
		scanner.close();
	}
}
