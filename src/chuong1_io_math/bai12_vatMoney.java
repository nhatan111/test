package chuong1_io_math;
import java.util.Scanner;

public class bai12_vatMoney {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tien ban dau cua ban: ");
        double money = sc.nextDouble();

        double VAT  = money * 1.08;

        System.out.printf("So tien sau thue la: %.3f", VAT); 
        sc.close();
    }    
}
