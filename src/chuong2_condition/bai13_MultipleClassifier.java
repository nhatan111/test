package chuong2_condition;
import java.util.Scanner;

public class bai13_MultipleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        int number = sc.nextInt();
        
        if(number % 2 == 0) System.out.println("Even");
        if(number % 3 == 0) System.out.println("Multiple of 3");
        if(number % 6 == 0) System.out.println("Chia het cho ca 2 va 3");
        
        sc.close();
    }
}
