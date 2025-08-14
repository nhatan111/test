package chuong1_io_math;
import java.util.Scanner;

public class bai5_linearEquation {
    public static void main(String[] args)
    {
        double a, b, root;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao he so cua ptrinh bac 1 (a, b)");
        a = sc.nextDouble();
        b = sc.nextDouble();

        root = -b/a; // a != 0
        if(a == 0)
        {
            if(b ==0) System.out.println("Ptrinh co vo so nghiem");
            else System.out.println("Ptrinh vo nghiem");
        }
        else System.out.printf("Ptrinh da cho co nghiem la: %.2f", root);

        sc.close();
    }
}
