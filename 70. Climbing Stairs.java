class Solution {

    //tle error 
    Map<Integer,Integer> cache;
    public int climbStairs1(int n) {
      cache=new HashMap<>();
      return climbStairs(n,cache);
    }
    public int climbStairs(int n, Map<Integer,Integer> cache){
        if(n<2) return 1;
        cache.put(n,climbStairs(n-1,cache) +climbStairs(n-2,cache));
        return cache.get(n);
    }
        public int climbStairs(int n) {
            if (n==1) return  n;
            int[] dp =new int[n+1];
            dp[1]=1;
            dp[2]=2;
            for(int i=3;i<=n;i++){
                dp[i]=dp[i-2]+dp[i-1];
            }
            return dp[n];

        }
}

/**

70. Climbing Stairs
Solved
Easy
Topics
Companies
Hint
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45
 */
