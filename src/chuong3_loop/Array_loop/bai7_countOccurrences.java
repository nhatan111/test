package chuong3_loop.Array_loop;
import java.util.*;

public class bai7_countOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, valueCount, count = 0;
        System.out.println("Nhap vao chi so cho mang: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap vao gia tri can dem: ");
        valueCount = sc.nextInt();

        for(int i = 0;i < arr.length;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }


        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] == valueCount) count++;
        }

        System.out.printf("So lan xuat hien cua %d: %d", valueCount, count);
        
        sc.close();
    }
}