package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai15_calculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, res = 1;
        System.out.println("Nhap vao 1 so: ");
        num = sc.nextInt();
        
        if(num == 0) res = 1;
        for(int i = 1;i <= num;i++) res *= i;

        System.out.println(num + "! la: " + res);
        sc.close();
    }
}
