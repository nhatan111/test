package chuong3_loop.Array_loop;
import java.util.*;

public class bai4_countEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, even_count = 0, odd_count = 0;
        System.out.println("Nhap vao chi so cua mang: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < n;i++) 
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) even_count++;
            else odd_count++;
        }

        System.out.println("evenCount = " + even_count);
        System.out.println("oddCount = " + odd_count);

        sc.close();
    }
}
