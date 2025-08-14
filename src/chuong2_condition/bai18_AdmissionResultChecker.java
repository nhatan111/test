package chuong2_condition;
import java.util.Scanner;

public class bai18_AdmissionResultChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao diem mon toan: ");
        float math_mark = sc.nextFloat();
        System.out.println("Nhap vao diem mon ly: ");
        float phy_mark = sc.nextFloat();
        System.out.println("Nhap vao diem mon hoa: ");
        float chem_mark = sc.nextFloat();

        float sum_mark = math_mark + phy_mark + chem_mark;
        if(sum_mark >= 20)
        {
            if(math_mark >= 5 && phy_mark >= 5 && chem_mark >= 5)
            {
                System.out.println("Pass");
            }
            else System.out.println("Pass 50%");
        }
        else System.out.println("not pass ");
        sc.close();

    }
}