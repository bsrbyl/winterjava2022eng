package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your fullname");

        String fullName = scan.nextLine();
        System.out.println("The user's name is : " + fullName);


    }
}
