package chuong3_loop.Array_loop;
import java.util.*;


public class bai22_countPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index, countPosElement = 0, countNegElement = 0;
        System.out.print("Nhap vao chi so cho mang: ");
        index = sc.nextInt();

        int[] arr = new int[index];
        for(int i = 0;i < index;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }


        for(int i = 0;i < index;i++)
        {
            if(arr[i] == 0) continue;
            else if(arr[i] < 0) countNegElement++;
            else countPosElement++;
        }

        System.out.println("Duong " + countPosElement);
        System.out.println("Am: " + countNegElement);
        

        sc.close();
    }
}
