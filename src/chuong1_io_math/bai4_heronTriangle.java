package chuong1_io_math;
import java.util.Scanner;
public class bai4_heronTriangle {
    public static void main(String[] args) {
        double pr, heron;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 3 canh cua tam giac: ");
        double edge1 = sc.nextDouble();
        double edge2 = sc.nextDouble();
        double edge3 = sc.nextDouble();

        pr = (edge1 + edge2 + edge3) / 2;
        heron = Math.sqrt(pr * (pr - edge1) * (pr - edge2) * (pr - edge3));
        System.out.printf("Dien tich cua tam giac la: %.2f", heron);
        
        sc.close();
    }
}
