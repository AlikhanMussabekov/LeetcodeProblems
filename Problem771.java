import java.util.Scanner;


/*

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

 */


public class Problem771 {
    public static void main(String[] args){

        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);

        System.out.println(solution.numJewelsInStones(in.next(), in.next()));


    }
}

class Solution{
    public int numJewelsInStones(String j, String s){

        int ans = 0;

        for (char chIn: j.toCharArray()){

            for(char chOut: s.toCharArray()){
                if (chIn == chOut){
                    ans ++;
                }
            }

        }

        return ans;
    }
}
