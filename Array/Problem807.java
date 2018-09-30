package Array;

public class Problem807 {

	public static void main(String[] args) {

		int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};

		Solution solution = new Solution();

		int ans = solution.maxIncrease(grid);

		System.out.println(ans);

	}

}

class Solution{

	public int maxIncrease(int[][] grid){

		int increase = 0;

		int length = grid[0].length;

		int[] rowMaxes = new int[length];
		int[] colMaxes = new int[length];


		for (int i = 0; i <length; i++) {

			for (int j = 0; j < length; j++) {
				rowMaxes[i] = Math.max(rowMaxes[i], grid[i][j]);
				colMaxes[j] = Math.max(colMaxes[j], grid[i][j]);
			}

		}

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				increase += Math.min(rowMaxes[i],colMaxes[j]) - grid[i][j];
			}
		}

		return increase;
	}

}
