package day04scannerIfstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        // "==" mean equal      "!="means does not equal

        Scanner scanner = new Scanner(System.in);
        System.out.println("tek mi cift mi kontrol edilecek sayi giriniz");
        int num=scanner.nextInt();

        if (num%2==0) {
            System.out.println("even-cift");
        }
        if (num%2!=0) {
            System.out.println("odd-tek");
        }
    }
}
