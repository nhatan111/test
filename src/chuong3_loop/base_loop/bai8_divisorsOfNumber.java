package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai8_divisorsOfNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Nhap vao 1 so: ");
        num = sc.nextInt();
         System.out.print("Uoc cua " + num + " la: ");

        for(int i = 1;i <= num;i++)
        {
            if(num % i == 0) System.out.printf("%d ", i);
        }

        sc.close();
    }
}