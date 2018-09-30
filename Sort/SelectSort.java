package Sort;

import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class SelectSort {

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

		for (int i = 0; i < array.length-1; i++) {

			int min = i;

			for (int j = i+1; j < array.length; j++) {

				if(array[j]<array[min]){

					//swap
					int temp = array[min];
					array[min] = array[j];
					array[j] = temp;

				}

			}
		}

	}
}

