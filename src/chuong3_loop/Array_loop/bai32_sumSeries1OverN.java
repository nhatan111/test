package chuong3_loop.Array_loop;
import java.util.*;

public class bai32_sumSeries1OverN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao 1 so n: ");
        n = sc.nextInt();
        float sum = 0.0f;

        for(float i = 1.0f;i <= n;i++) sum += 1/i;

        System.out.printf("Tong = %.4f", sum);

        sc.close();
    }    
}
