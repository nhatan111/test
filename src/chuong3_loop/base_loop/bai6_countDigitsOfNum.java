package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai6_countDigitsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, original_num, count = 0;
        System.out.println("Nhap vao 1 so nguyen: ");
        num = sc.nextInt();
        original_num = num;

        while(num != 0)
        {
            count++;
            num /= 10;
        }

        System.out.println("So cac chu so cua " + original_num + " la: " + count);
        sc.close();
    }
}
