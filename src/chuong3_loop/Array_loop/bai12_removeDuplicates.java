package chuong3_loop.Array_loop;
import java.util.*;

public class bai12_removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao chi so cua mang: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < arr.length;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        //vòng soát mảng
        for(int i = 0;i < n;i++)
        {
            //vòng bắt đầu check
            for(int j = i + 1;j < n;j++)
            {
                //điều kiện
                if(arr[i] == arr[j])
                {
                    // shift element phía sau lên
                    for(int k = j;k < n - 1;k++)
                    {
                        arr[k] = arr[k + 1];
                    }
                    n--; // reduce length after check
                    j--; // return to check again
                }
            }
        }

        
        for(int i = 0;i < n;i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}