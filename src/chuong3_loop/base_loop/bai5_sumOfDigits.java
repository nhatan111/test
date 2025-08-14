package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai5_sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Nhap vao 1 so nguyen: ");
        num = sc.nextInt();
        
        while(num != 0)
        {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
