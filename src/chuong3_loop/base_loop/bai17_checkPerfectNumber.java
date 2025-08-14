package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai17_checkPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        System.out.println("Nhap vao 1 so: ");
        num = sc.nextInt();

        for(int i = 1;i <= num / 2;i++)
        {
            if(num % i == 0) sum += i;
        }

        if(sum == num) System.out.println(num + " la so hoan hao");
        else System.out.println(num + " ko phai la so hoan hao");

        sc.close();
    }
}
