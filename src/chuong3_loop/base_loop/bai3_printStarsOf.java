package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai3_printStarsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        System.out.println("Nhap vao so cot: ");
        rows = sc.nextInt();
        
        for(int i = 1;i <= rows;i++)
        {
            for(int j = 1;j <= rows;j++) System.out.print("*");
            System.out.print("\n");
        }

        sc.close();
    }    
}
