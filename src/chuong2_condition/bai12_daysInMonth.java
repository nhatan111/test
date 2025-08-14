package chuong2_condition;
import java.util.Scanner;

public class bai12_daysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thang hien tai: ");
        int month = sc.nextInt();
        int day;
        switch(month)
        {
            case 1, 3, 5, 7, 8, 10, 12 -> day = 31;
            case 4, 6, 9, 11 -> day = 30;
            case 2 -> day = 28;
            default -> 
            {
                System.out.println("Khong hop le");
                day = -1;
            }
        }

        if(day > 0) System.out.println("Thang " + month + " co " + day + " ngay");
        sc.close();
    }
}
