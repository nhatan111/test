package chuong1_io_math;
import java.util.Scanner;

public class bai10_floorNum3 {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap vao 1 so: ");
       double num = sc.nextDouble();
       System.out.printf("So thap phan sau khi lam tron xuong la: %.2f\n", Math.floor(num));
       System.out.printf("So thap phan sau khi lam tron len la: %.2f\n", Math.ceil(num));
       System.out.printf("So thap phan sau khi lam tron chuan la: %d", Math.round(num));
       
       sc.close();
    }
}