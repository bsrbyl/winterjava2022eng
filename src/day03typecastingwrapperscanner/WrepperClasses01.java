package day03typecastingwrapperscanner;

public class WrepperClasses01 {
    public static void main(String[] args) {

        /*
        Wrapper Class
        boolean ==> Boolean
        char ==> Character
        .
        .
        .
         */

        char c='d';
        Character wc=c;


        int i=12;
        Integer wi=i;

        float f=1.2F;
        Float wf =f;


        short s=23;
        Short ps=s;
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128

        System.out.println(Short.MAX_VALUE + Long.MIN_VALUE); //-9223372036854743041


    }
}
