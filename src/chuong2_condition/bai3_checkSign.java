package chuong2_condition;
import java.util.Scanner;

public class bai3_checkSign
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        int number = sc.nextInt();
        
        if(number < 0) System.out.println("So " + number + " la so am");
        else if(number == 0) System.out.println("So 0");
        else System.out.println("So " + number + " la so duong");

        sc.close();
    }
}