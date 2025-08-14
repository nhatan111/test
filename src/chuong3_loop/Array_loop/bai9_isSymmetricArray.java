package chuong3_loop.Array_loop;
import java.util.*;

public class bai9_isSymmetricArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean isReversed = true;
        System.out.println("Nhap vao chi so cho mang: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < arr.length;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }


        for(int i = 0;i < arr.length;i++)
        {
            if((arr[i] == arr[n - i - 1]) && isReversed) isReversed = true;
            else 
            {
                isReversed = false; 
                break;
            }
        }

        if(isReversed) System.out.println("Mang doi xung");
        else System.out.println("Mang ko doi xung");

        sc.close();
    }
}
