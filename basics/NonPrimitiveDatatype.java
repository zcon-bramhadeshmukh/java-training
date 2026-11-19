public class NonPrimitiveDatatype {

    public static void main(String[] args) {

        //string
        String name = "Java";
        System.out.println("String " + name + " of bytes " + name.length());

        //array
        int[] numbers = {10, 20, 30, 40};
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println("Array Bytes: " + (numbers.length * Integer.BYTES) );

        //class object
        Student student = new Student("Bramha", 24);
        System.out.print("Object data, name: " + student.name + ", age: " + student.age);
        System.out.println(" Object bytes: " + (student.name.length() + Integer.BYTES));
    }

}

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/*
output:
String Java of bytes 4
Array: 10 20 30 40 Array Bytes: 16
Object data, name: Bramha, age: 24 Object bytes: 10
*/