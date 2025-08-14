package chuong3_loop.Array_loop;
import java.util.*;

public class bai23_averagePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index, countPosElements = 0;
        float sumPosElements = 0f;
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
            if(arr[i] > 0)
            {
                sumPosElements += arr[i];
                countPosElements++;
            }
        }
        if(countPosElements == 0) System.out.println("Khong co so duong nao");
        else System.out.println("TB cong: " + sumPosElements/countPosElements);

        sc.close();
    }
}