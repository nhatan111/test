package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai11_printSolidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("Nhap vao chieu cao cua tam giac: ");
        height = sc.nextInt();

        for(int i = 1;i <= height;i++)
        {
            for(int j = 1;j <= i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
