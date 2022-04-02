package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uzun ve kısa kenari giriniz");
        int uzun= scan.nextInt();
        int kisa= scan.nextInt();
        System.out.println("alan : " +uzun*kisa);
        System.out.println("cevre : " +2*(uzun+kisa));
    }
}
