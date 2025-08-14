package chuong2_condition;
import java.util.Scanner;

public class bai5_FindLargestOfThreeNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max;
        System.out.println("Nhap vao so thu nhat: ");
        int number1 = sc.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int number2 = sc.nextInt();
        System.out.println("Nhap vao so thu ba: ");
        int number3 = sc.nextInt();

        // giả sử số lớn nhất là số thứ nhất
        if(number1 >= number2 && number1 >= number3) max = number1;
        else if(number2 >= number3) max = number2;
        else max = number3;


        System.out.println("So lon nhat la: " + max);

        sc.close();
    }
}