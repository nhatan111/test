package chuong3_loop.Array_loop;
import java.util.*;

public class bai33_findLCM {
    public static int GCD(int a, int b)
    {
        if(b == 0) return a;
        return GCD(b, a % b);
    }

    public static int LCM(int a, int b)
    {
        return (a * b) / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Nhap vao so thu 1: "); num1 = sc.nextInt();
        System.out.print("Nhap vao so thu 2: "); num2 = sc.nextInt();

        int res = LCM(num1, num2);

        System.out.print("BCNN cua " + num1 + " va " + num2 + " la: " + res);
        
        sc.close();
    }
}
