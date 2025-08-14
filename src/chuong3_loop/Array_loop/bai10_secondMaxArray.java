package chuong3_loop.Array_loop;
import java.util.*;

public class bai10_secondMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao chi so cho mang: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        int max = arr[0], second = arr[1];
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 1;i < arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                System.out.println("max = " + max);
            }            
            else if(arr[i] > second && arr[i] != max)
            {
                second = arr[i];
                System.out.println("second = " + second);
            }
        }

        System.out.println("So lon thu hai: " + second);

        sc.close();
    }
}
