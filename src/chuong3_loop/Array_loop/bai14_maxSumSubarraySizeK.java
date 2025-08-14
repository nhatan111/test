package chuong3_loop.Array_loop;
import java.util.*;

public class bai14_maxSumSubarraySizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.println("Nhap vao chi so cho mang: ");
        n = sc.nextInt();
        System.out.println("Nhap vao do dai khoang: ");
        k = sc.nextInt();

        int[] arr = new int[n];

        int windowSlide = 0;
        
        for(int i = 0;i < n;i++)
        {
            System.out.println("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < k;i++) windowSlide += arr[i];
        int maxSum = windowSlide;

        // đcm cửa sổ trượt
        for(int i = k;i < n;i++) 
        {
            windowSlide += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSlide);
        }

        System.out.println("Tong lon nhat cua doan con co do dai " + k + " la: " + maxSum);
        sc.close();
    }    
}
