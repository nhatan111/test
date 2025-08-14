package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai2_productOfFirstN
{
    public static void main(String[] args) {
        int num, result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        num = sc.nextInt();

        for(int i = 1;i <= num;i++) result *= i;

        System.out.println("Giai thua cua " + num + "! la " + result);

        sc.close();
    }
}