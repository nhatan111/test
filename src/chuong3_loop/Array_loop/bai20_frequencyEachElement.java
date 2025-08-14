package chuong3_loop.Array_loop;
import java.util.*;


public class bai20_frequencyEachElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index;
        System.out.println("Nhap vao chi so cua mang: ");
        index = sc.nextInt();

        int[] arr = new int[index];
        int[] freq = new int[index];
        for(int i = 0;i < index;i++)
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < index;i++)
        {
            freq[arr[i]]++;
        }

        for(int i = 0;i < index;i++)
        {
            if(freq[i] == 0) continue;
            else System.out.printf("So lan xuat hien cua %d la: %d\n", i, freq[i]);
        }


        sc.close();
    }
}
