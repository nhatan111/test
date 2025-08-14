package chuong3_loop.Array_loop;
import java.util.*;

public class bai31_countPrimeToN {
    public static boolean isPrime(int n)
    {
        if(n <= 1) return false;

        for(int i = 2;i <= Math.sqrt(n);i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, countPrime = 0;
        System.out.print("Nhap vao 1 so n: ");
        n = sc.nextInt();

        for(int i = 1;i <= n;i++)
        {
            if(isPrime(i)) countPrime++;
        }

        System.out.print("Co " + countPrime + " so nguyen to: ");
        for(int i = 1;i <= n;i++)
        {
            if(isPrime(i)) System.out.print(i + " ");
        }

        sc.close();
    }
}
