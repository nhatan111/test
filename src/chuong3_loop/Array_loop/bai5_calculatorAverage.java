package chuong3_loop.Array_loop;
import java.util.*;

public class bai5_calculatorAverage
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; float sum = 0f;
        System.out.println("Nhap vao chi so mang: ");
        n = sc.nextInt();

        int[] array = new int[n];

        for(int i = 0;i < n;i++) 
        {
            System.out.print("Nhap vao array[" + i + "]: ");
            array[i] = sc.nextInt();
        }

        for(int i = 0;i < n;i++) 
        {
            sum += array[i];
        }

        float avg_array = sum / n;
        System.out.println("Trung binh mang: " + avg_array);
        
        sc.close();
    }
}