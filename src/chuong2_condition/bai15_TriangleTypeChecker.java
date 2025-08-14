package chuong2_condition;
import java.util.Scanner;

public class bai15_TriangleTypeChecker {
    public static int Power(int a)
    {
        return a * a;
    }

    public static void main(String[] args) {
        int edge1, edge2, edge3;
        boolean isTriangle, isSquareTriangle;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 3 canh cua 1 tam giac: ");
        System.out.println("Nhap vao do dai 3 canh cua 1 tam giac: ");
        edge1 = sc.nextInt();
        edge2 = sc.nextInt();
        edge3 = sc.nextInt();

        if(edge1 < edge2 + edge3 && edge3 < edge1 + edge2 && edge2 < edge1 + edge3) isTriangle = true;
        else isTriangle = false;

        if(Power(edge1) == Power(edge2) + Power(edge3)
        || Power(edge2) == Power(edge1) + Power(edge3) 
        || Power(edge3) == Power(edge1) + Power(edge2))
        {
            isSquareTriangle = true;
        }
        else isSquareTriangle = false;

        if(isTriangle)
        {
            if(isSquareTriangle) System.out.println("Day la tam giac vuong");
            else
            {
                if(edge1 == edge2 && edge2 == edge3)
                {
                    System.out.println("Day la tam giac deu");
                }
                else if(edge1 == edge2 || edge2 == edge3 || edge1 == edge3) System.out.println("Day la tam giac can");
            }
        }

        sc.close();
    }
}
