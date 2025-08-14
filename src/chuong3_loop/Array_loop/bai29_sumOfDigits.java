package chuong3_loop.Array_loop;
import java.util.*;

public class bai29_sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0, originalNum;
        System.out.print("Nhap vao 1 so: ");
        num = sc.nextInt();

        if(num < 0) num = Math.abs(num);
        originalNum = num;

        while(num != 0)
        {
            sum += num % 10;
            num /= 10;
        }

        System.out.print("Tong cac chu so cua " + originalNum + " la: " + sum);

        sc.close();
    }
}
