package chuong1_io_math;
import java.util.Scanner;

public class bai9_floorNum {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap vao 1 so: ");
       double num = sc.nextDouble();
       System.out.printf("So thap phan sau khi lam tron la: %.2f\n", num);
       
       sc.close();
    }
}
