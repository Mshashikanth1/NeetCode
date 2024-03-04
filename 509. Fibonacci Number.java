class Solution {

    /**
    dp solutions possible : first is staring from dirty recursion
    Time : O(nlog(n))
    Space : O(1).   
      
9/ms
Beats
27.36%
of users with Java
40.00
MB
Beats
90.00%
of users with Java
     */
    public int fib1(int n) {
        if(n==0) return 0;
        else if(n<2) return 1;
        return fib(n-1)+fib(n-2);
    }

/**
dp thinking can be memorized from drawing the recursive tree 
Time : O(n)
Space : O(n)
Runtime
84
ms
Beats
11.68%
of users with Java
40.48
MB
Beats
30.30%
of users with Java

 */
 Map<Integer,Integer> cache=new HashMap<>();
    public int fib2(int n) {
        if(n==0) return 0;
        else if(n<2) return 1;
        cache.put(n, fib(n-1)+fib(n-2));
        return cache.get(n);
    }

    /**
    tabulation :
    Time : O(n)
    Space : O(n)
0
ms
Beats
100.00%
of users with Java

40.66
MB
Beats
13.38%
of users with Java

     */
       public int fib(int n) {

           if(n==0) return 0;
           int[] dp =new int[n+1];
           dp[0]=0;
           dp[1]=1;

           for(int i=2;i<=n;i++){
               dp[i]=dp[i-1]+dp[i-2];
           }
           return dp[n];
       }
       

}
