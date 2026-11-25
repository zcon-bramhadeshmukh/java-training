import java.util.ArrayList;
class ExArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //it is a sequential and linear ds and duplicates are allowed, index based.
        //internally arraylist is implemented as an array so when we add elements to it,
        //it will automatically resize the array if needed, resizing is done by creating a new array 
        //with larger size and copying the elements from the old array to the new array
        //the capacity of an ArrayList is 10, when the number is added and if number of elements exceeds the capacity
        //the capacity is increased by 50% of the current capacity so if the current capacity is 10 the new capacity will be 15
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        //add at specific index
        list.add(2,5);
        System.out.println(list);

        //remove element
        list.remove(1);
        System.out.println(list);
        
        //get element
        System.out.println(list.get(0));

        //update element
        list.set(0, 10);
        System.out.println(list);

        //other methods
        //length
        System.out.println(list.size());
        //empty or not
        System.out.println(list.isEmpty());
        //find
        System.out.println(list.contains(5));
        //search
        System.out.println(list.indexOf(3));//if element not found it will return -1
        //sublist
        System.out.println(list.subList(1, 3));

        //clear the list
        list.clear();
        System.out.println(list);


    }
}

/*
output:
[1, 2, 3, 4]
[1, 2, 5, 3, 4]
[1, 5, 3, 4]
1
[10, 5, 3, 4]
4
false
true
2
[5, 3]
[]
 */