class Student {

    //fully encapsulated class
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Bramha");
        s1.setRollNo(01);

        System.out.print("Roll No.: " + s1.getRollNo() + " Name: " + s1.getName());
    }
}

/*
output:
Roll No.: 1 Name: Bramha
 */
