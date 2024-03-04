class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<n+1;i++){
            ans[i]=countSetBits(i);
        }
        return ans;
    }

    public int countSetBits(int a){
        int count=0;
        while(a>0){
            count+=a%2;
            a/=2;
        }
        return count;
    }
}

/**

fact that we repeatedly division with 2 remainder give lsb to msb in binary representation
338. Counting Bits
Solved
Easy
Topics
Companies
Hint
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

 

Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 

Constraints:

0 <= n <= 105

 */
