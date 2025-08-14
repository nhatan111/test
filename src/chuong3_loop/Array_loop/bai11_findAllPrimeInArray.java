package chuong3_loop.Array_loop;
import java.util.*;

public class bai11_findAllPrimeInArray {
    public static boolean isPrime(int n)
    {
        if(n <= 1) return false;

        for(int i = 2;i <= Math.sqrt(n);i++) if(n % i == 0) return false;

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao chi so cho mang: ");
        n = sc.nextInt();

        int[] array = new int[n];

        for(int i = 0;i < array.length;i++)
        {
            System.out.print("Nhap vao array[" + i + "]: ");
            array[i] = sc.nextInt();
        }


        for(int i = 0;i < array.length;i++)
        {
            if(isPrime(array[i])) System.out.print(array[i] + " ");
            else continue;
        }
        
        sc.close();
    }  
}