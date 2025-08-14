package chuong2_condition;
import java.util.Scanner;

public class bai17_taxiFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so km ban da di: ");
        float dis = sc.nextFloat(), money = 1f;
        if(dis < 2) money = 15 * dis;    
        else if(dis <= 5) money = 13 * dis;
        else money = 11 * dis;

        System.out.printf("So tien ban phai tra sau khi chay %.1fkm la: %.0fk", dis, money);
        
        sc.close();
    }
}
