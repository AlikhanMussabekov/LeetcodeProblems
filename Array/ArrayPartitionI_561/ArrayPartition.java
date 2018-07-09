package Array.ArrayPartitionI_561;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;
import java.util.Arrays;

/*
561. Array Partition I
Given an array of 2n integers, your task is to group these integers into n pairs of integer,
say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].

https://leetcode.com/problems/array-partition-i/description/
 */

public class ArrayPartition {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        int[] a = new int[20100];
        int i=0;

        Scanner array = new Scanner(in.nextLine());

        while (array.hasNext()){
            a[i] = array.nextInt();
            i++;
        }

        System.out.println(solution.pair(a));

    }
}

class Solution{

    public int pair(int[] a){

        int ans = 0;
        Arrays.sort(a);

        for (int i=0;i<a.length-1;i+=2){
            //System.out.println(a[i]);
            ans+=a[i];
        }

        return ans;
    }

}
