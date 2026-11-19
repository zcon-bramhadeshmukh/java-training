public class Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        //arithmetic operators
        System.out.println("Arithmetic: " + (a + b) + " " + (a - b) + " " + (a * b) + " " + (a / b) + " " + (a % b));

        //unary operators
        System.out.println("Unary: " + (++a) + " " + (b--));

        //assignment operators
        int c = 5;
        System.out.println("Assignment: " + c);

        //relational operators
        System.out.println("Relational: " + (a == b) + " " + (a != b) + " " + (a > b) + " " + (a < b) + " " + (a >= b) + " " + (a <= b));

        //logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical: " + (x && y) + " " + (x || y) + " " + (!x));

        //ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Ternary: " + max);

        //instanceof operator
        Object text = "Java";
        System.out.println("Instanceof: " + (text instanceof String));
    }
}

/*
output:
Arithmetic: 13 7 30 3 1
Unary: 11 3
Assignment: 5
Relational: false true true false true false
Logical: false true false
Ternary: 11
Instanceof: true
 */
