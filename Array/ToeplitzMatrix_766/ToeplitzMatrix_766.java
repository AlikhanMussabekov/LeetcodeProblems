package Array.ToeplitzMatrix_766;

import java.util.Scanner;

public class ToeplitzMatrix_766 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        int[][] matrix = new int[21][21];
        int i=0,j=0;

        while(in.hasNextLine()) {
            //Scanner matrixScanner = new Scanner(in.nextLine());

            String curStr = in.nextLine();

            System.out.println(curStr);

            /*for (char ch: in.nextLine().toCharArray()){
                matrix[i][j] = (int)ch - 48;
                //System.out.print(matrix[i][j]+" ");
                j++;
            }
            i++;*/
        }

        in.close();

        System.out.println(solution.check(matrix,i,j));

    }
}

class Solution{
    public boolean check(int[][] matrix,int n,int m){
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        return true;
    }
}
