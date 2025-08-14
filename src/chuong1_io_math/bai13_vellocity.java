package chuong1_io_math;
import java.util.Scanner;

public class bai13_vellocity {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao quang duong: ");
        double distance = sc.nextDouble();
        System.out.println("Nhap vao thoi gian: ");
        double time = sc.nextDouble();

        if(time < 0)
        {
            System.out.println("Nhap lai: ");
            time = sc.nextDouble();
        }
    
        double vel = distance/time;

        System.out.printf("Van toc cua xe da di duoc la: %.2f", vel);
        
        sc.close();
    }
}
