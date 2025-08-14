package chuong3_loop.Array_loop;
import java.util.*;


public class bai24_sumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index, k;
        float sum = 0.0f;
        System.out.println("Nhap vao chi so mang: ");
        index = sc.nextInt();
        System.out.println("Nhap vao so can chia het: ");
        k = sc.nextInt();

        int[] arr = new int[index];
        for(int i = 0;i < index;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < index;i++)
        {
            if(arr[i] % k == 0) sum += arr[i];
        }

        System.out.println("Tong = " + sum);


        sc.close();
    }
}
