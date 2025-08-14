package chuong3_loop.Array_loop;
import java.util.*;

public class bai25_countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0, original;
        System.out.print("Nhap vao 1 so nguyen duong: ");
        num = sc.nextInt();

        original = num;
        while(num != 0)
        {
            count++;
            num /= 10;
        }

        if(original == 0) count++;

        System.out.print("Tong cac chu so cua " + original + " la: " + count);


        sc.close();
    }
}
