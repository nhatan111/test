package chuong2_condition;
import java.util.Scanner;

public class bai10_checkLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao nam hien tai: ");
        int year = sc.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println(year + " la nam nhuan");
        }
        else System.out.println(year + " khong phai nam nhuan");
        sc.close();
    }
}
