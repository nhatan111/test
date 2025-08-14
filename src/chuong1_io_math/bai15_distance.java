package chuong1_io_math;
import java.util.Scanner;

public class bai15_distance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao toa do diem thu nhat: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Nhap vao toa do diem thu hai: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Khoang cach giua hai diem A(" + x1 + ", " + y1 + ")" + " va diem " + "B(" + x2 + ", " + y2 + ")" + " la: " + distance);
        sc.close();
    }
}
