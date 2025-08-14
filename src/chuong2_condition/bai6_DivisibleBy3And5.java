package chuong2_condition;
import java.util.Scanner;

public class bai6_DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        int number = sc.nextInt();

        if(number % 15 == 0) System.out.println(number + " chia het cho 3 va 5");

        sc.close();
    }
}
