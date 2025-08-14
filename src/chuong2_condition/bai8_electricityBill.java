package chuong2_condition;
import java.util.Scanner;

public class bai8_electricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so watt nha ban: ");
        float Watt = sc.nextFloat();
        float money;

        if(Watt < 0)
        {
            System.out.println("Ko hop le, nhap lai: ");
            Watt = sc.nextFloat();
        }
        if(Watt <= 50) money = Watt * 1.678f;
        else if(Watt <= 100) money = Watt * 1.734f;
        else money = Watt * 2.014f;

        System.out.printf("Tien dien thang nay cua ban la %.2f ngan dong", money);
        
        sc.close();
    }
}
