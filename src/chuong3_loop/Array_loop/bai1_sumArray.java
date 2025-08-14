package chuong3_loop.Array_loop;
import java.util.*;


public class bai1_sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        System.out.println("Nhap vao chi so cua mang: ");
        n = sc.nextInt();
        int[] arr = new int[100];
        
        for(int i = 0;i < n;i++)
        {
            System.out.printf("Nhap vao arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < n;i++) sum += arr[i];

        System.out.printf("Tong cua mang la: %d", sum);
        sc.close();
    }
}
