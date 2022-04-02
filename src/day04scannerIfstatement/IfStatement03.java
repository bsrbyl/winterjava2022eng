package day04scannerIfstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir gun ismi giriniz");
        String dayName=scanner.next();
        if (dayName.equals("monday")) {
         System.out.println("weekday");}
         if (dayName.equals ("tuesday")) {
         System.out.println("weekday");}
         if (dayName.equals("wednesday")) {
         System.out.println("weekday");}
        if (dayName.equals("thursday")) {
         System.out.println("weekday");}
       if (dayName .equals("friday") ) {
        System.out.println("weekday");}
         if (dayName.equals("friday") ) {
        System.out.println("weekend day");}
        if (dayName.equals("sunday") ) {
         System.out.println("weekend day");}

        //profesyonel olan yazim sekli

        if (dayName.equals("monday")||
            dayName.equals ("tuesday")||
            dayName.equals("wednesday")||
            dayName.equals("thursday")||
            dayName .equals("friday")){
            System.out.println("weekday");
        }
        if (dayName.equals("friday")||dayName.equals("sunday")){
            System.out.println("weekend day");
        }




    }
}
