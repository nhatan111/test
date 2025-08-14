package chuong2_condition;
import java.util.Scanner;

public class bai14_TriangleValidator {
    public static void main(String[] args) {

        int edge1, edge2, edge3;
        boolean isTriangle;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai 3 canh cua 1 tam giac: ");
        edge1 = sc.nextInt();
        edge2 = sc.nextInt();
        edge3 = sc.nextInt();

        if(edge1 < edge2 + edge3 && edge3 < edge1 + edge2 && edge2 < edge1 + edge3) isTriangle = true;
        else isTriangle = false;
        
        if(isTriangle) System.out.println("Day la 1 tam giac");
        else System.out.println("Day khong phai la 1 tam giac");

        sc.close();
    }
}
