package chuong3_loop.Array_loop;
import java.util.*;

public class bai3_findMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, maxElement, minElement;
        System.out.println("Nhap vao chi so mang: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i = 0;i < n;i++)
        {
            System.out.printf("Nhap vao arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        
        maxElement = arr[0];
        minElement = arr[1];
        
        for(int i = 0;i < n;i++)
        {
            if(arr[i] > maxElement) maxElement = arr[i];
            if(arr[i] < minElement) minElement = arr[i];
        }

        System.out.println("Max = " + maxElement);
        System.out.println("Min = " + minElement);

        sc.close();
    }
}
