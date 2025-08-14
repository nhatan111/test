package chuong2_condition;
import java.util.Scanner;

public class bai2_checkEvenOdd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        int number = sc.nextInt();
        
        if(number % 2 == 0) System.out.println("So " + number + " la so chan");
        else System.out.println("So " + number + " la so le");

        sc.close();
    }
}