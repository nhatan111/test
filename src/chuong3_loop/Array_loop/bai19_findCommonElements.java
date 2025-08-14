package chuong3_loop.Array_loop;
import java.util.*;


public class bai19_findCommonElements {
    public static void ArrInput(int[] arr, int index, Scanner sc)
    {
        for(int i = 0;i < index;i++) 
        {
            System.out.print("Nhap vao arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index1, index2;
        System.out.println("Nhap vao chi so cua mang dau tien: ");
        index1 = sc.nextInt();
        System.out.println("Nhap vao chi so cua mang thu hai: ");
        index2 = sc.nextInt();
        
        System.out.println("Mang 1: ");
        int[] arr1 = new int[index1];
        ArrInput(arr1, index1, sc);

        System.out.println("Mang 2: ");
        int[] arr2 = new int[index2];
        ArrInput(arr2, index2, sc);
        
        

        System.out.print("Phan tu chung: ");
        for(int i = 0;i < index1;i++)
        {
            for(int j = 0;j < index2;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.print(arr1[i] + " ");
                }
            }
        }


        sc.close();
    }
}
