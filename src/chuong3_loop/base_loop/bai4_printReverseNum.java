package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai4_printReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, original_num, reversed_num = 0;
        System.out.println("Nhap vao 1 so: ");
        num = sc.nextInt();
        original_num = num;

        while(num != 0)
        {
            int digit = num % 10;
            reversed_num = reversed_num * 10 + digit;
            num /= 10;
        }

        System.out.println("So dao nguoc cua " + original_num + " la: " + reversed_num);

        sc.close();
    }    
}