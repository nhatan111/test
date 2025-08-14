package chuong3_loop.Array_loop;
import java.util.*;

public class bai35_secondMaxArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index, max, second_max;
        System.out.print("Nhap vao chi so cho mang: ");
        index = sc.nextInt();
        
        int[] arr = new int[index];

        for(int i = 0;i < index;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        max = arr[0]; second_max = arr[1];

        for(int i = 1;i < index;i++)    
        {
            if(arr[i] > max)
            {
                second_max = max;
                max = arr[i];
            }
            else if(arr[i] > second_max && arr[i] != max)
            {
                second_max = arr[i];
            }
        }

        if(second_max == max) System.out.println("Khong ton tai");
        else System.out.print("So lon thu hai trong mang la: " + second_max);
        sc.close();
    }
}
