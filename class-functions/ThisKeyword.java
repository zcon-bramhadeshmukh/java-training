public class ThisKeyword {

    int a = 10;

    ThisKeyword() {
        System.out.println("default constructor");
    }

    ThisKeyword(int a) {
        this(); // calling default constructor using this keyword
        //we can use this() by passing parameters to call parameterized constructor of the same class

        this.a = a; // assigning value to instance variable
        //this is used to refer current class instance variable

        System.out.println("parameterized constructor");
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(5);
        System.out.println("value of a: " + obj.a);
    }
}

/*
output:
default constructor
parameterized constructor
value of a: 5
 */
