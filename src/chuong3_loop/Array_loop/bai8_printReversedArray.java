package chuong3_loop.Array_loop;
import java.util.*;

public class bai8_printReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = new int[100];
        System.out.println("Nhap vao chi so cua mang: ");
        n = sc.nextInt();

        for(int i = 0;i < n;i++)
        {
            System.out.printf("Nhap vao arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < n / 2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.print("Mang sau khi dao nguoc la: ");
        for(int i = 0;i < n;i++) System.out.print(arr[i] + " ");

        sc.close();
    }
}

