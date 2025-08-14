package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai10_findPowerOfNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, pow = 1;
        System.out.println("Nhap vao so thu nhat: ");
        num1 = sc.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        num2 = sc.nextInt();

        for(int i = 1;i <= num2;i++)
        {
            pow *= num1;
        }

        System.out.printf("%d^%d la: %d", num1, num2, pow);
        sc.close();
    }
}