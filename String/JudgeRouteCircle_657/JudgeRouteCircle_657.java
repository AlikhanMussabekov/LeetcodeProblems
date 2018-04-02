package String.JudgeRouteCircle_657;

/*
657. Judge Route Circle
Initially, there is a Robot at position (0, 0).
Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string.
And each move is represent by a character.
The valid robot moves are R (Right), L (Left), U (Up) and D (down).
The output should be true or false representing whether the robot makes a circle.
https://leetcode.com/problems/judge-route-circle/description/
 */

import java.util.Scanner;

public class JudgeRouteCircle_657 {
    public static void main(String[] args){

        Solution soluiton = new Solution();
        Scanner in = new Scanner(System.in);

        System.out.println(soluiton.check(in.next()));


    }

}

class Solution{
    boolean check(String s){

        int x=0,y=0;
        boolean ans;

        for(char ch: s.toCharArray()){
            switch (ch){
                case 'U':
                    y+=1;
                    break;
                case 'D':
                    y-=1;
                    break;
                case 'L':
                    x-=1;
                    break;
                case 'R':
                    x+=1;
                    break;
                default:
                    break;
            }
        }

        if (x == 0 && y ==0){
            ans = true;
        }else {
            ans = false;
        }
            return ans;
    }
}
