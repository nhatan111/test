package chuong3_loop.Array_loop;
import java.util.*;

public class bai30_drawSquareStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao do dai canh cua hinh vuong: ");
        n = sc.nextInt();

        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= n;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        sc.close();
    }
}
