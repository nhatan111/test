package chuong1_io_math;

import java.util.Scanner;
public class bai3_pr_ar_circle {
    public final static double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh hinh tron: ");
        double radi = sc.nextDouble();
        
        double area = PI * Math.pow(radi, 2);
        System.out.println("Chu vi cua hinh tron la " + (2 * PI * radi));
        System.out.println("Dien tich cua hinh tron la " + area);
        sc.close();
    }
}
