class Animal {
    
    void sound() {
        System.out.println("Animal makes a sound");
    }

    //method overloading: same method name, different parameter list, same/different return type, same class
    //also called compile time polymorphism/early binding
    void sound(String type) {
        System.out.println("Animal makes a " + type + " sound");
    }

    final void death() {
        //can't orverride this method in child classes
        System.out.println("Every animal dies.");
    }

    private void sleep() {
        //can't override this method in child classes
        System.out.println("Animal sleeps");
    }

    static void eat() {
        //can't override this method in child classes
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    
    //method overriding: same method name, same parameter list, same return type, different class
    //alo called runtime polymorphism/late binding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    void sound(String type) {
        System.out.println("Dog makes a " + type + " bark");
    }

    void play() {
        System.out.println("Dog plays");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        a.sound("generic");
        a.death();
        //a.sleep();//can't access private method
        Animal.eat();

        Dog d = new Dog();
        d.sound();
        d.sound("loud");

        //downcasting
        Animal a2 = new Dog();//upcasting
        //here java provides support for the upcasting of objects without any explicit casting. 
        //This is because a Dog is an Animal, so it can be treated as an Animal and it is safe to do so.
        a2.sound();

       // a2.play();//here we can't access because the reference class-Animal don't have play() method
       if(a2 instanceof Dog) {
            Dog d2 = (Dog) a2; //downcasting
            d2.play();
        }
        //we always need to check the type of object while downcastin using instanceof operator to avoid
        //ClassCastException at runtime, downcasting is also called unsafe/blind cating
    }
}

/*
output:
Animal makes a sound
Animal makes a generic sound
Every animal dies.
Animal eats
Dog barks
Dog makes a loud bark
Dog barks
Dog plays
 */