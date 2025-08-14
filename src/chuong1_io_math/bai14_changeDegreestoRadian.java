package chuong1_io_math;
import java.util.Scanner;


public class bai14_changeDegreestoRadian
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do cua goc do: ");
        double degrees = sc.nextDouble();
        double rad = degrees * (Math.PI / 180);

        System.out.println("Do sau khi doi qua rad la: "  + rad);

        sc.close();
    }
}