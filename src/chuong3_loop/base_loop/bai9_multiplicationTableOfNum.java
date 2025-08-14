package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai9_multiplicationTableOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Nhap vao 1 so: ");
        num = sc.nextInt();

        System.out.println("Bang cuu chuong cua " + num + " la: ");
        for(int i = 1;i <= 10;i++)
        {
            System.out.printf("%d x %d = %d\n",num, i,  num * i);
        }
        sc.close();
    }
}
