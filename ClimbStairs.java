package com.demo;

/*Write a Java program to find distinct ways to climb to the top (n steps to reach the top) of stairs.
Each time you climb, you can climb 1 or 2 steps.
Example: n = 5 a) 1+1+1+1+1 = 5 b) 1+1+1+2 = 5 c) 1+2+2 = 5 d) 2+2+1 = 5 e) 2+1+1+1 = 5 f) 2+1+2 = 5
g) 1+2+1+1 = 5 h) 1+1+2+1 = 5 */

public class ClimbStairs {
    public static int countWaysToClimb(int n) {
        if (n <= 0) {
            return 0;
        }

        int[] dp = new int[n + 1];

        dp[0] = 1;

        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int ways = countWaysToClimb(n);
        System.out.println("Distinct ways to climb to the top of " + n + " steps: " + ways);
    }
}
