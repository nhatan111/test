package chuong2_condition;
import java.util.Scanner;

public class bai7_gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao diem mon Toan (0-10): ");
        float math_mark = sc.nextFloat();
        System.out.println("Nhap vao diem mon Ly (0-10): ");
        float phy_mark = sc.nextFloat();
        System.out.println("Nhap vao diem mon Hoa (0-10): ");
        float chem_mark = sc.nextFloat();

        float avg_mark = (math_mark + phy_mark + chem_mark) / 3;

        System.out.printf("Diem trung binh cua ban la: %.2f\n", avg_mark);
        if(avg_mark < 5) System.out.println("Hoc sinh yeu");
        else if(avg_mark < 6.5) System.out.println("Hoc sinh trung binh");
        else if(avg_mark < 8) System.out.println("Hoc sinh kha");
        else System.out.println("Hoc sinh gioi");

        sc.close();
    }    
}
