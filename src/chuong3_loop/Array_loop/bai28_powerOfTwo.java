package chuong3_loop.Array_loop;
import java.util.*;

public class bai28_powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        boolean is_exp = false;
        System.out.print("Nhap vao 1 so: ");
        num = sc.nextDouble();
        

        for(int i = 0;i <= num;i++)
        {
            if((num % Math.pow(2, i)) == 0)
            {
                System.out.println("Pow = " + Math.pow(2, i));
                is_exp = true;
                if(Math.pow(2, i) >= num) break;
            }
            else is_exp = false;
        }

        if(is_exp) System.out.print(num + " la luy thua cua 2");
        else System.out.print(num + "khong phai la luy thua cua 2");

        sc.close();
    }
}