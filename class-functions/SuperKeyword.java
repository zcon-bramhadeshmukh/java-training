class Parent {

    int a = 10;

    Parent() {
        System.out.println("default constructor");
    }

    Parent(int a) {
        this.a = a;
        System.out.println("parameterized constructor");
    }

    public void display() {
        System.out.println("Parent display method, value of a: " + a);
    }
}

class Child extends Parent {

    int a;

    Child() {
        super(); // calling parent class default constructor using super keyword
        System.out.println("Child default constructor");
    }

    Child(int a) {
        super(a); // calling parent class parameterized constructor using super keyword
        this.a = super.a + 10;
        System.out.println("Child parameterized constructor");
    }

    @Override
    public void display() {
        super.display(); // calling parent class display method using super keyword
        System.out.println("Child display method, value of a: " + a);
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        Child child1 = new Child();
        child1.display();

        Child child2 = new Child(30);
        child2.display();

    }
}

/*
output:
default constructor
Child default constructor
Parent display method, value of a: 10
Child display method, value of a: 20
parameterized constructor
Child parameterized constructor
Parent display method, value of a: 30
Child display method, value of a: 30
 */