package chuong3_loop.Array_loop;
import java.util.*;

public class bai15_splitArrayPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean neg = true, pos = true;
        System.out.println("Nhap vao chi so cho mang: ");  
        n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < n;i++)
        {
            System.out.println("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < n;i++)
        {
            if(neg)
            {
                System.out.print("So am: ");
                neg = false;
            }
            if(arr[i] < 0) System.out.print(arr[i] + " ");
        }
        
        for(int i = 0;i < n;i++)
        {
            if(pos)
            {
                System.out.print("So duong: ");
                pos = false;
            }
            if(arr[i] > 0) System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }    
}
