package chuong2_condition;
import java.util.Scanner;

public class bai9_bmiCalculator {
    public static void main(String[] args) {

        // chieu cao quy ra mét
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao cua ban: ");
        float height = sc.nextFloat();
        System.out.println("Nhap vao can nang cua ban: ");
        float weight = sc.nextFloat();

        float BMI = weight / (height * height);
        System.out.printf("Chi so BMI cua ban la: %.2f", BMI);

        if(BMI < 18.5) System.out.println("Ban gay vcl");
        else if(BMI < 25) System.out.println("Ban hoan toan binh thuong");
        else System.out.println("Ban beo vcl");

        sc.close();
    }
}
