package chuong3_loop.Array_loop;
import java.util.*;

public class bai27_checkPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Nhap vao 1 so nguyen duong: ");
        num = sc.nextInt();
        boolean isPrime = true;

        while(num < 0)
        {
            System.out.print("Nhap lai so duong: ");
            num = sc.nextInt();
            if(num > 0) break;
        }
        if(num <= 1) isPrime = false;
        for(int i = 2;i <= Math.sqrt(num);i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println(num + " la so nguyen to");
        else System.out.print(num + " khong phai la so nguyen to");

        sc.close();
    }
}
