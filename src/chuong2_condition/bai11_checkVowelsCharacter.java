package chuong2_condition;
import java.util.Scanner;

public class bai11_checkVowelsCharacter {
    public static void main(String[] args) {
        boolean isVowel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 ki tu");
        String character = sc.nextLine();

        if(character.equals("u") || character.equals("U")) isVowel = true;
        else if(character.equals("e") || character.equals("E")) isVowel = true;
        else if(character.equals("o") || character.equals("O")) isVowel = true;
        else if(character.equals("a") || character.equals("A")) isVowel = true;
        else if(character.equals("i") || character.equals("I")) isVowel = true;
        else isVowel = false;

        if(isVowel) System.out.println(character + " la ki tu nguyen am");
        else System.out.println(character + " khong phai ki tu nguyen am");

        sc.close();
    }
}
