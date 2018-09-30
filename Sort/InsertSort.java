package Sort;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}

		sort(array);

		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

	}

	private static void sort(int[] array){

		for (int i = 1; i < array.length; i++) {

			int temp = array[i];
			int j = i;

			while(j > 0 && array[j-1] >= temp){
				array[j] = array[j-1];
				j--;
			}

			array[j] = temp;

			System.out.println("------------------");

			for (int k = 0; k < array.length; k++) {
				System.out.print(array[k] + " ");
			}

			System.out.println();

		}

	}

	private static void swap(int a, int b) {

		int c = a;
		a = b;
		b = c;

	}

}
