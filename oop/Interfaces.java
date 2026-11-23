interface Animal {
    
    boolean alive = true; // by default all variables in interface are public static final
    void makeSound();
    void move();
    //interface can have default, static and private methods with body along with abstract methods
    //only difference in abstract class and interface is that abstract class can have constructors 
    //and instance variables but interface cannot have them
    //only private methods are private all are by default pubic in interface
    public default void sleep() {
        System.out.println("The animal is sleeping.");
    }

    public static void eat() {
        System.out.println("The animal is eating.");
    }

    private void breathe() {
        System.out.println("The animal is breathing.");
    }
}

//extends will have priority over implemetnts
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Barks");
    }

    @Override
    public void move() {
        System.out.println("The dog runs.");
    }
}

public class Interfaces{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
        myDog.move();
        myDog.sleep();
        Animal.eat();
        // myDog.breathe();
    }
}
/*
output:
Barks
The dog runs.
The animal is sleeping.
The animal is eating.
 */