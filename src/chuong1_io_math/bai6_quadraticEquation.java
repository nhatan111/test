package chuong1_io_math;
import java.util.Scanner;

public class bai6_quadraticEquation {
    public static void main(String[] args)
    {
        double a, b, c, delta, root1, root2, double_root;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao he so cua ptrinh (a, b, c): ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if((a + b + c) == 0)
        {
            root1 = 1;
            root2 = c / a;
            System.out.printf("root1 = %.2f\n", root1);
            System.out.printf("root2 = %.2f", root2);
        }
        else if(a - b + c == 0)
        {
            root1 = -1;
            root2 = - (c / a);
            System.out.printf("root1 = %.2f\n", root1);
            System.out.printf("root2 = %.2f", root2);
        }
        else 
        {
            delta = Math.pow(b, 2) - 4 * a * c;

            double_root = (-b) / (2 * a);
            
            
            if(delta < 0) System.out.println("Ptrinh vo nghiem");
            if(delta == 0) System.out.printf("Ptrinh co nghiem kep: %.2f", double_root);
            if(delta > 0)
            {
                root1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                root2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Nghiem thu nhat cua ptrinh la: %.2f\n", root1);
                System.out.printf("Nghiem thu hai cua ptrinh la: %.2f", root2);
            }
        }
        sc.close();
    }
}