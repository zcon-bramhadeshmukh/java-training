import java.util.ArrayDeque;

public class ExArrayDeque {
    public static void main(String[] args) {
        //this a deque works as a double ended queue where we can add and remove elements from both ends
        //similar to queue but with more flexibility and it is growble in size
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        //Adding elements to the deque
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);

        System.out.println("Initial: " + deque);
        System.out.println("Size: " + deque.size());

        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());
        System.out.println("After removals: " + deque);

        //get the elements from the front and rear without removing them
        System.out.println("Peek front: " + deque.peekFirst());
        System.out.println("Peek rear: " + deque.peekLast());
        //similarly we can use pollFirst and pollLast to remove and return the elements from front and rear
        System.out.println("Poll front: " + deque.pollFirst());
        System.out.println("Poll rear: " + deque.pollLast());
        System.out.println("After polling: " + deque);

        System.out.println("Deque empty? " + deque.isEmpty());

        //Clearing the deque
        deque.clear();
        System.out.println("After clear: " + deque);


    }
}

/*
output:
Initial: [1, 2, 3, 4, 5]
Size: 5
Removed from front: 1
Removed from rear: 5
After removals: [2, 3, 4]
Peek front: 2
Peek rear: 4
Poll front: 2
Poll rear: 4
After polling: [3]
Deque empty? false
After clear: []
*/