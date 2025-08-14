package chuong3_loop.Array_loop;
import java.util.*;

public class bai6_sumAtEvenPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum_evenPos = 0;
        System.out.println("Nhao vao chi so cho mang: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < arr.length;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < arr.length;i++)
        {
            if(i % 2 == 0) sum_evenPos += arr[i];
        }

        System.out.println("Tong cac phan tu tai vi tri chan: " + sum_evenPos);

        sc.close();
    }
}
