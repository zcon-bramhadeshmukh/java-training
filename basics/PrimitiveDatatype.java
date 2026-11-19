public class PrimitiveDatatype {

    public static void main(String[] args) {

        //integer catergory
        int num = 1000;
        System.out.println("int " + num + " of bytes " + Integer.BYTES);

        short sh = 10;
        System.out.println("short sh " + sh + " of bytes " + Short.BYTES);

        byte by = 1;
        System.out.println("byte " + by + " of bytes " + Byte.BYTES);

        long lg = 1000000l;
        //each integer value is by default treated as int so use "l" as suffix for long
        System.out.println("long " + lg + " of bytes " + Long.BYTES);

        //floating point catergory
        float flt = 1.01f;
        //each floating value is by default treated as double so use "f" as suffix for float
        System.out.println("float " + flt + " of bytes " + Float.BYTES);

        double dbl = 1.01;
        System.out.println("double " + dbl + " of bytes " + Double.BYTES);

        //character catergory
        char ch = 'A';
        System.out.println("char " + ch + " of bytes " + Character.BYTES);

        //boolean catergory
        boolean bool = true;
        System.out.println("boolean " + bool + " JVM-dependent (~1 byte)");

    }
}
/*
output:
int 1000 of bytes 4
short sh 10 of bytes 2
byte 1 of bytes 1
long 1000000 of bytes 8
float 1.01 of bytes 4
double 1.01 of bytes 8
char A of bytes 2
boolean true JVM-dependent (~1 byte)
*/