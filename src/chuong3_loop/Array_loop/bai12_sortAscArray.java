package chuong3_loop.Array_loop;
import java.util.*;

public class bai12_sortAscArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao chi so cho mang: ");
        n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0;i < n;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < n - 1;i++)
        {
            for(int j = 0;j < n - i - 1;j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Mang sau khi sap xep tang dan: ");
        for(int i = 0;i < n;i++) System.out.print(arr[i] + " ");

        sc.close();
    } 
}
