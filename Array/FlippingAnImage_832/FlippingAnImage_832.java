package Array.FlippingAnImage_832;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class FlippingAnImage_832 {

    public static void main(String[] args){

    	Solution solution = new Solution();
		Scanner scanner = new Scanner(System.in);

		int[][] a = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}} ;

		for (int i=0; i<a[0].length; i++) {

			solution.reverseAndInvert(a[i]);

		}
		for(int i=0; i <a[0].length;i ++){

			for (int j=0;j<a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();

		}

    }

}


class Solution{

	public void reverseAndInvert(int[] a){

		int length = a.length;

		int r = length - 1;

			for( int i=0; i < length/2 ; i++ ){
				int first = a[i];
				int second = a[r];

				a[i] = second;
				a[r] = first;
				r--;
			}

			invert(a);

	}

	private void invert(int[] a) {

		for(int i=0; i<a.length; i++){

			if (a[i] == 0){
				a[i] = 1;
			}else {
				a[i] = 0;
			}

		}

	}

}