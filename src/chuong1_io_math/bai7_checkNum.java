package chuong1_io_math;
import java.util.Scanner;

public class bai7_checkNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
        double num = sc.nextDouble();

        if(num < 0) System.out.println("So am");
        else System.out.println("So duong");

        sc.close();
    }
}
