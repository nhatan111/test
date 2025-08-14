package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai13_sumOddUnderNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0, i = 0;
        System.out.println("Nhap vao 1 so: ");
        num = sc.nextInt();

        while(i < num)
        {
            if(i % 2 != 0) sum += i;
            i++;
        }

        System.out.println("Tong cac so le nho hon " + num + " la: " + sum);
        sc.close();
    }
}
