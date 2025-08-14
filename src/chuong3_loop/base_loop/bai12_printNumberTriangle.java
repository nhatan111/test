package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai12_printNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Nhap chieu cao cua tam giac so: ");
        num = sc.nextInt();

        for(int i = 1;i <= num;i++)
        {
            for(int j = 1;j <= i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
