package chuong1_io_math;
import java.util.Scanner;

public class bai11_powNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao so mu cua no: ");
        int b = sc.nextInt();
        double pow_num = Math.pow(a, b);
        
        System.out.printf("So mu 3 cua %d la: %.3f", a, pow_num);

        sc.close();
    } 
}  
