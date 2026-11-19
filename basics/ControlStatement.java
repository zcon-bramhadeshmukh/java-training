import java.util.ArrayList;

public class ControlStatement {

    public static void main(String[] args) {
        int number = 4;

        //if, else if and else
        if (number > 10) {
            System.out.println("Greater than 10");
        } else if (number > 5) {
            System.out.println("Greater than 5");
        } else {
            System.out.println("5 or less");
        }

        //ternary operator
        System.out.println(number + " is " + ((number % 2 == 0) ? "even" : "odd"));

        //switch statement
        switch (number) {
            //rule switch instead of classic colon, break
            case 1 -> System.out.println("Number is one");
            case 2 -> System.out.println("Number is two");
            case 3 -> System.out.println("Number is three");
            case 4 -> System.out.println("Number is four");
            case 5 -> System.out.println("Number is five");
            default -> System.out.println("Another number");
        }

        //for loop
        System.out.print("For loop: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(" " + i);
            if (i == 5) {
                break;
            }
        }

        //while loop
        System.out.print("\nWhile loop: ");
        int i = 1;
        while (i <= 3) {
            System.out.print(" " + i);
            i++;
        }

        //do-while loop
        System.out.print("\nDo-while loop: ");
        int j = 1;
        do {
            System.out.print(" " + j);
            j++;
        } while (j <= 3);

        //foreach loop
        int[] values = {10, 20, 30};
        System.out.print("\nValues in the array: ");
        for (int value : values) {
            System.out.print(value +" ");
        }

        //we can use foreach loop with collections as well
        ArrayList<String> names = new ArrayList<>();
        names.add("Bramha");
        names.add("XYZ");
        names.add("PQR");
        System.out.print("\nNames in the list: ");
        for (String name : names) {
            System.out.print(name +" ");
        }
    }
}

/*
output:
5 or less
4 is even
Number is four
For loop:  1 3 5
While loop:  1 2 3
Do-while loop:  1 2 3
Values in the array: 10 20 30 
Names in the list: Bramha XYZ PQR 
*/