import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        //accessing elements in the array
        System.out.println("First element: " + nums[0]);
        System.out.println("Second element: " + nums[1]);

        //modifying an element in the array
        nums[2] = 10;
        System.out.println("Modified third element: " + nums[2]);

        //iterating through the array
        System.out.println("All elements in the array:");
        for (int number : nums) {
            System.out.println(number);
        }

        //infinite for loop 
        /*
        for(;;){
            System.out.println("Hello World");
        }
         */

        //multi-dimensional array
        int[][] twoDArr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        //accessing elements in the multi-dimensional array
        System.out.println("Element at row 1, column 2: " + twoDArr[0][1]);
        for (int[] twoDArr1 : twoDArr) {
            for (int j = 0; j < twoDArr1.length; j++) {
                System.out.print(twoDArr1[j] + " ");
            }
            System.out.println();
        }
        /*
        regular for loop to iterate through the multi-dimensional array
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                System.out.print(twoDArr[i][j] + " ");
            }
            System.out.println();
        }
         */

        //array methods
        int[] nums2 = {5, 3, 8, 1, 2};

        //printing the array
        System.out.println("Original array: " + Arrays.toString(nums2));

        //length of the array
        System.out.println("Length of the array: " + nums2.length);

        //sorting the array
        Arrays.sort(nums2);
        System.out.println("Sorted array: " + Arrays.toString(nums2));

        //searching in the array
        int index = Arrays.binarySearch(nums2, 3);
        System.out.println("Index of 3 in the sorted array: " + index);

        //copying the array
        int[] numsCopy = Arrays.copyOf(nums2, nums2.length);
        System.out.println("Copied array: " + Arrays.toString(numsCopy));

        //shallow copying the array
        int[] numsShallowCopy = nums2;
        System.out.println("Shallow copied array: " + Arrays.toString(numsShallowCopy));
        //modifying the original array make changes to the shallow copied array as it is not a deep copy
        //just a reference to the original array

        //addition of two arrays
        int[] nums3 = {1, 2, 3};
        int[] nums4 = {4, 5, 6};
        int[] sumArray = new int[nums3.length];
        for (int i = 0; i < nums3.length; i++) {
            sumArray[i] = nums3[i] + nums4[i];
        }
        System.out.println("Sum of two arrays: " + Arrays.toString(sumArray));

        /*
        we cannot have array with initial length while declaring it.
        int[] nums5 = new int[5]={1, 2, 3, 4, 5}; //this will give error
        */
        
        //array of reference of "Student" type objects
        Student[] students = new Student[2];
        students[0] = new Student("Bramha", 24);
        students[1] = new Student("XYZ", 22);
        for (Student student : students) {
            System.out.println("Student name: " + student.name + ", age: " + student.age);
        }

        
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
First element: 1
Second element: 2
Modified third element: 10
All elements in the array:
1
2
10
4
5
Element at row 1, column 2: 2
1 2 3 
4 5 6 
7 8 9 
Original array: [5, 3, 8, 1, 2]
Length of the array: 5
Sorted array: [1, 2, 3, 5, 8]
Index of 3 in the sorted array: 2
Copied array: [1, 2, 3, 5, 8]
Shallow copied array: [1, 2, 3, 5, 8]
Sum of two arrays: [5, 7, 9]
Student name: Bramha, age: 24
Student name: XYZ, age: 22
*/