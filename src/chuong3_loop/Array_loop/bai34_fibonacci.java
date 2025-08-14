package chuong3_loop.Array_loop;
import java.util.*;

public class bai34_fibonacci {
    static int[] dp;
    public static int createFibonacci(int n)
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(dp[n] != -1) return dp[n];

        dp[n] = createFibonacci(n - 1) + createFibonacci(n - 2);
        return dp[n];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao 1 so n: ");
        n = sc.nextInt();
        dp = new int[n + 1];
        for (int i = 0; i <= n; i++) dp[i] = -1;
        for(int i = 0;createFibonacci(i) <= n;i++)
        {
            System.out.print(createFibonacci(i) + " ");
        }
        
        sc.close();
    }    
}
