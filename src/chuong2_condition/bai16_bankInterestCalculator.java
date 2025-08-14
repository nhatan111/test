package chuong2_condition;
import java.util.Scanner;

public class bai16_bankInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tien ban dau cua ban");
        float money = sc.nextFloat();

        float interest_rate = money * (5.8f / 100f);
        System.out.println("So tien ban nhan duoc sau khi gui ngan hang la: " + interest_rate);

        sc.close();
        
    }
}
