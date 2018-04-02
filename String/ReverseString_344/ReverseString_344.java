package String.ReverseString_344;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString_344 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println(solution.reverse(in.next()));

    }
}

class Solution{
    public String reverse(String s){
        char[] word = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }

        String ans = new String(word);
        return ans;
    }
}
