package day04scannerIfstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int num=scan.nextInt();

        if (num>0) {
            System.out.println("pozitif");
        }
        if (num<0) {
            System.out.println("negatif");
        }
        if (num==0) {
            System.out.println("notr");
        }
    }
}
