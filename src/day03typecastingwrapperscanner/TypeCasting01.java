package day03typecastingwrapperscanner;

public class TypeCasting01 {

    public static void main(String[] args) {
        // byte< short< int< long < float < double

        //small-> large data : Auto Widening
        byte b= 47;
        int i =b;

        //large->small data : Exlicit Norrowing
        double d=1.2;
        short s =(short)d;

        //conver short 257 to byte?
        short r=257;
        byte y= (byte)r;
        System.out.println(y);//1

    }


    }

