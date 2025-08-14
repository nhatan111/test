package chuong3_loop.base_loop;
import java.util.Scanner;

public class bai14_checkPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isPrime = true;
        System.out.println("Nhap vao 1 so: ");
        num = sc.nextInt();

        if(num == 1) isPrime = false;
        else if(num == 2) isPrime = true;
        for(int i = 3;i <= num;i++)
        {
            if(num % i == 0) 
            {
                isPrime = true;
                break;
            }
        }

        if(isPrime) System.out.println(num + " la so nguyen to");
        else System.out.println(num + " ko phai la so nguyen to"); 
        sc.close();
    }
}
