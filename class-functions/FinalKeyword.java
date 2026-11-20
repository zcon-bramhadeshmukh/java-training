class Parent {

    final int a = 10;//internally final is a const-private variable, can't be reassigned
    static final int b = 20;//way to have a constant variable in java for class level variable

    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(int a) {
        //  this.a = a;//final variable can't be reassigned
        System.out.println("Parent parameterized constructor");
    }

    public final void display() {
        //final method can't be overridden
        System.out.println("Parent display method, value of a: " + a);
    }
}

class Child extends Parent {

    Child() {
    //super.a+=1; //final variable can't be reassigned
    display();

    }
    // public void display() {
    //     System.out.println("Child display method, value of a: " +(super.a+1));
    // }//final method can't be overridden error
}


public final class FinalKeyword {
    //final class can't be inherited

    public static void main(String[] args) {
        Child child1 = new Child();

        Child child2 = new Child();

    }
}

/*
output:
Parent default constructor
Parent display method, value of a: 10
Parent default constructor
Parent display method, value of a: 10
*/