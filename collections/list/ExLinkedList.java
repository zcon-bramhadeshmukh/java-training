import java.util.Iterator;
import java.util.LinkedList;
public class ExLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //it is a sequential and non-linear ds and duplicates are allowed, index based.
        //internally linkedlist is implemented as a doubly linked list so when we add elements to it,
        //it will create a new node and link it to the previous node
        //the capacity of a LinkedList is not fixed, it can grow and shrink as needed
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Iterator to traverse the list
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        //add at specific index
        list.add(2, 5);
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
        //pop
        System.out.println(list.pop());
        //push
        list.push(20);
        System.out.println(list);
        //peek
        System.out.println(list.peek());
        //add first
        list.addFirst(30);
        System.out.println(list);
        //add last
        list.addLast(40);
        System.out.println(list);

        //clear the list
        list.clear();
        System.out.println(list);
    }
}

/*
output:
1 2 3 4 5 
[1, 2, 5, 3, 4, 5]
[1, 5, 3, 4, 5]
1
[10, 5, 3, 4, 5]
5
false
true
2
[5, 3]
10
[20, 5, 3, 4, 5]
20
[30, 20, 5, 3, 4, 5]
[30, 20, 5, 3, 4, 5, 40]
[]
 */
