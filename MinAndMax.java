package assignment_3;

import java.util.Scanner;

public class MinAndMax {

	static void printMaxAndMinInCol(int[][] mat, int m, int n, int col) {
		int max = mat[0][col];
		int min = mat[0][col];
		for (int i = 0; i < m; i++) {
			// max
			if (max < mat[i][col]) {
				max = mat[i][col];
			}

			// min
			if (min > mat[i][col]) {
				min = mat[i][col];
			}
		}
		System.out.println("Minimum and Maximum elements in col " + (col + 1) + " are: " + min + "," + max);
	}

	static void printMaxAndMinInRow(int[][] mat, int m, int n, int row) {
		int max = mat[row][0];
		int min = mat[row][0];
		for (int i = 0; i < n; i++) {
			// max
			if (max < mat[row][i]) {
				max = mat[row][i];
			}

			// min
			if (min > mat[row][i]) {
				min = mat[row][i];
			}
		}
		System.out.println("Minimum and Maximum elements in row " + (row + 1) + " are: " + min + "," + max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter row size: ");
		int m = sc.nextInt();
		System.out.print("enter column size: ");
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		System.out.println("enter elements: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// min and max in rows
		for (int i = 0; i < m; i++) {
			printMaxAndMinInRow(a, m, n, i);
		}

		// min and max in cols
		for (int i = 0; i < n; i++) {
			printMaxAndMinInCol(a, m, n, i);
		}

	}

}