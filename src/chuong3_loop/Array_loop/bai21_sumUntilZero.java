package chuong3_loop.Array_loop;
import java.util.*;

public class bai21_sumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index, sum = 0;
        System.out.print("Nhap vao chi so cua mang: ");
        index = sc.nextInt();

        int[] arr = new int[index];
        for(int i = 0;i < index;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < index;i++)
        {
            sum += arr[i];
            if(arr[i] == 0) break;
        }

        System.out.print("Sum = " + sum);

        sc.close();
    }
}
