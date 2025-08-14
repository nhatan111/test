package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai1_sumOfFirstN {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        int num = sc.nextInt();

        for(int i = 1;i <= num;i++) sum += i;

        System.out.printf("Sum = %d", sum);
        sc.close();
    }
}
