package chuong1_io_math;
import java.util.Scanner;

public class bai1_squareNum {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
        num = sc.nextInt();

        System.out.println("Binh phuong cua " + num + " la " + Math.pow(num, 2));
        sc.close();
    }
}
