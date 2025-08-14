package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai16_printInvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("Nhap vao chieu cao cua tam giac");
        height = sc.nextInt();

        for(int i = height;i >= 1;i--)
        {
            for(int j = i;j >= 1;j--) System.out.print("*");
            System.out.print("\n");
        }
        sc.close();
    }    
}