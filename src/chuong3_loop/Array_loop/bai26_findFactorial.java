package chuong3_loop.Array_loop;
import java.util.*;

public class bai26_findFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, res = 1;
        System.out.print("Nhap vao 1 so: ");
        num = sc.nextInt();

        while(num < 0)
        {
            System.out.print("Vui long nhap so duong: ");
            num = sc.nextInt();
            if(num >= 0) break;
        }
        for(int i = 1;i <= num;i++) res *= i;

        System.out.print("Factorial of Num = " + res);

        sc.close();
    }
}
