package chuong3_loop.Array_loop;
import java.util.*;


public class bai16_longestIncreasingSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index, count = 1, max_count = 0;
        System.out.println("Nhap vao chi so cho mang: ");
        index = sc.nextInt();
        
        int[] arr = new int[index];
        for(int i = 0;i < index;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < index - 1;i++)
        {
            if(arr[i] > arr[i + 1])
            {
                max_count = count;
                count = 1;
            }
            else
            {
                count++;
                max_count = count;
            }
        }

        System.out.printf("Do tang dai nhat cua mang la: %d", max_count);

        sc.close();
    }
}