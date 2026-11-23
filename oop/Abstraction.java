abstract class Employee {

    private int eid;
    private double salary;
    private String name;

    public Employee(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void calculateBonus(double salary);
}

class Trainee extends Employee {

    private double bonusPercent;

    public double getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(double bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    public Trainee(int eid, String name, double salary, double bonusPercent) {
        super(eid, name, salary);
        this.bonusPercent = bonusPercent;
    }

    @Override
    void calculateBonus(double salary) {
        System.out.println("Bonus: " + (getSalary() * (getBonusPercent() / 100.0)));
    }

    //we can overload abstract method from parent class
    void calculateBonus(double salary, double bonusPercent) {
        System.out.println("Bonus: " + (salary * (bonusPercent / 100.0)));
    }

    void show() {
        System.out.println("Roll No.: " + getEid() + " Name: " + getName());
    }

}

abstract class Student {

    //abstract class with no abstract method
    int rollNo = 10;
    String name = "Bramha";

    void show() {
        System.out.println("Roll No.: " + rollNo + " Name: " + name);
    }
}

public class Abstraction {

    public static void main(String[] args) {
        //Employee e1 = new Employee(10,"Bramha", 25000.0);//compile time error - Employee is abstract; cannot be instantiated
        //Student s1 = new Student();//same compile time error - Student is abstract; cannot be instantiated

        Trainee t1 = new Trainee(10, "Bramha", 25000.0, 2.0);
        t1.show();
        t1.calculateBonus(t1.getSalary());
        t1.calculateBonus(t1.getSalary(), t1.getBonusPercent());

        Employee e1 = new Trainee(10, "Bramha", 25000.0, 2.0);
        e1.calculateBonus(e1.getSalary());
        //here we are having upcasting where we can have reference of parent class and object of child class.
        //But we can only access the methods of parent class. So, we cannot access the methods of child class using parent class reference.
        //e1.show();//compile time error - cannot find symbol - method show() in class Employee
        //e1.calculateBonus(e1.getSalary(), e1.getBonusPercent());//compile time error - cannot find symbol symbol:   method getBonusPercent() location: variable e1 of type Employee
        //e1.calculateBonus(20000.0, 2.0);//compiletime error - method calculateBonus in class Employee cannot be applied to given types; required: double found:    double,double reason: actual and formal argument lists differ in length
    }
}

/*
output:
Roll No.: 10 Name: Bramha
Bonus: 500.0
Bonus: 500.0
Bonus: 500.0
 */
