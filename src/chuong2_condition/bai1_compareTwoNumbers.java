package chuong2_condition;
import java.util.Scanner;

public class bai1_compareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        int number1 = sc.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int number2 = sc.nextInt();

        if(number1 > number2) System.out.println("So " + number1 + " lon hon " + number2);
        else System.out.println("So " + number2 + " lon hon so " + number1);

        sc.close();
    }
}