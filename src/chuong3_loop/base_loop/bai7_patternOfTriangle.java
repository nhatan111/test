package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai7_patternOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.println("Nhap vao so cot cua tam giac: ");
        rows = sc.nextInt();

        for(int i = 1;i <= rows;i++)
        {
            for(int j = 1;j <= i;j++) System.out.print("*");
            System.out.printf("\n");
        }
        sc.close();
    }
}
