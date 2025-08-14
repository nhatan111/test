package chuong1_io_math;
import java.util.Scanner;

public class bai8_absNum {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Nhap vao 1 so: ");
        num = sc.nextDouble();
        System.out.println("|" + num + "|" + " = " + Math.abs(num));
        sc.close();
    }
}
