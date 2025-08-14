package chuong3_loop.Array_loop;
import java.util.*;


public class bai18_countPairSumX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index, x, count_pair = 0, sum = 0, isFinalPair = 1;
        System.out.println("Nhap vao chi so cho mang: ");
        index = sc.nextInt();
        System.out.println("Nhap vao tong cua cac cap: ");
        x = sc.nextInt();

        // tạo mảng
        int[] arr = new int[index];
        for(int i = 0;i < index;i++)
        {
            System.out.println("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < index;i++)
        {
            for(int j = i + 1;j < index;j++)
            {
                // tạo tổng
                sum = arr[i] + arr[j];
                if(sum == x)
                {   
                    count_pair++;
                }
                sum = 0;
            }
        }

        System.out.printf("Co %d cap tao thanh tong %d la: ",count_pair, x);
        for(int i = 0;i < index;i++)
        {
            for(int j = i + 1;j < index - 1;j++)
            {
                sum = arr[i] + arr[j];
                if(sum == x)
                {
                    if(isFinalPair < count_pair)
                    {
                        System.out.printf("(%d, %d), ", arr[i], arr[j]);
                        isFinalPair++;
                    }
                    else System.out.printf("(%d, %d)", arr[i], arr[j]);
                }
                sum = 0;
            }
        }

        sc.close();
    }
}