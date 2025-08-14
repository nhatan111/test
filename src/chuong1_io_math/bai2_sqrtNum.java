package chuong1_io_math;
import java.util.Scanner;

public class bai2_sqrtNum {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        num = sc.nextInt();

        System.out.println("Can bac 2 cua " + num + " la " + Math.sqrt(num));
        sc.close();
    }
}
