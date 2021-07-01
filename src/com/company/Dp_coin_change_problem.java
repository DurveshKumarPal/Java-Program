package Dp;

import java.sql.Array;
import java.util.Arrays;

public class Dp_coin_change_problem {
    public static void main(String[] args) {
        int n = 18;
        int a[] = {7, 5, 1};
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        int ans = mincoins(n, a, dp);
        System.out.println(ans);

    }

    static int mincoins(int n, int a[], int dp[]) {
        if (n == 0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (n - a[i] >= 0) {
                int subans = 0;
                if (dp[n - a[i]] != -1) {
                    subans = dp[n - a[i]];
                } else {
                    int subAns = mincoins(n - a[i], a, dp);
                }
                if (subans != Integer.MAX_VALUE && subans + 1 < ans) {
                    ans = subans + 1;
                }

            }
        }
        return dp[n] = ans;
    }
}