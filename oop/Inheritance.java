class Grand {

    void show() {
        System.out.println("Grand");
    }
}

class Parent extends Grand {

    void show() {
        super.show();
        System.out.println("Parent");
    }
}

class Child extends Parent {

    void show() {
        super.show();
        System.out.println("Child");
    }
}

class Child2 extends Parent {

    void show() {
        super.show();
        System.out.println("Child2");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Grand g = new Grand();
        g.show();

        Parent p = new Parent();
        p.show();

        Child c = new Child();
        c.show();

        Child2 c2 = new Child2();
        c2.show();
    }
}


/*
output:
Grand
Grand
Parent
Grand
Parent
Child
Grand
Parent
Child2
 */