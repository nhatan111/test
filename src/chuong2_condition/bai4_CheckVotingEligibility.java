package chuong2_condition;
import java.util.Scanner;

public class bai4_CheckVotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tuoi cua ban: ");
        int age = sc.nextInt();
        
        //nếu tuổi nhỏ hơn 0 thì nhập lại
        if(age < 0)
        {
            System.out.println("So tuoi khong hop le, nhap lai: ");
            age = sc.nextInt();
        }

        if(age >= 18) System.out.println("Eligible");
        else System.out.println("Not eligible");
        sc.close();
    }
}