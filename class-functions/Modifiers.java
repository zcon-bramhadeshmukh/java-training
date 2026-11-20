class JavaClass1 {
    //instance variable
    private int pvtValue = 10;
    protected int protValue = 11;
    public int pubValue = 12;
    int a = 13; //default access modifier

    public JavaClass1() {
        //default constructor
        System.out.println("parent default constructor called");
    }

    public JavaClass1(int a) {
        //parameterized constructor
        System.out.println("parameterized constructor called with value: " + a);
    }

    void display() {
        System.out.println("display method called");
    }

    
}

class JavaClass2 extends JavaClass1 {
    public void show() {
        JavaClass2 obj = new JavaClass2();
        //accessing instance variables of parent class
        System.out.println("obj.protValue: " + obj.protValue);
        System.out.println("obj.pubValue: " + obj.pubValue);
        System.out.println("obj.a: " + obj.a);
        // System.out.println("obj.pvtValue: " + obj.pvtValue); //this will give error as private variable is not accessible in child class
    }
}

class JavaClass3 {
    public void show() {
        JavaClass1 obj = new JavaClass1();
        //accessing instance variables of parent class
        System.out.println("obj.pubValue: " + obj.pubValue);
        System.out.println("obj.a: " + obj.a);
        System.out.println("obj.protValue: " + obj.protValue); //this will give error as protected variable is not accessible in non-child class
        // System.out.println("obj.pvtValue: " + obj.pvtValue); //this will give error as private variable is not accessible in non-child class
    }
}

public class Modifiers {
    public static void main(String[] args) {
        JavaClass1 obj1 = new JavaClass1();
        obj1.display();

        JavaClass1 obj2 = new JavaClass1(5);
        obj2.display();

        JavaClass2 obj3 = new JavaClass2();
        obj3.show();

        JavaClass3 obj4 = new JavaClass3();
        obj4.show();
    }
}

/**
 output:
parent default constructor called
display method called
parameterized constructor called with value: 5
display method called
parent default constructor called
parent default constructor called
obj.protValue: 11
obj.pubValue: 12
obj.a: 13
parent default constructor called
obj.pubValue: 12
obj.a: 13
obj.protValue: 11
 */