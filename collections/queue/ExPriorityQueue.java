
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;


public class ExPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(8);
        minHeap.add(1);
        minHeap.add(2);
        System.out.println("Min-Heap: " + minHeap);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new MaxComparator());
        //PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder())://another way to create maxHeap
        //Here we are using comparator cause we can't modify Integer class and make it comparable
        //if we are having a custom class here instead of Integer then we can implemet Comparable interface
        //override the compareTo() method and get or own custom priority for our custom class
        maxHeap.add(5);
        maxHeap.add(2);
        maxHeap.add(8);
        maxHeap.add(1);
        maxHeap.add(2);
        
        Iterator<Integer> iterator = maxHeap.iterator();
        System.out.print("Max-Heap: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //Fetching the elements from the maxHeap in sorted order
        System.out.print("Max-Heap in sorted order: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println("\nSize: " + maxHeap.size());

        //peek
        System.out.println("Peek: " + minHeap.peek());
        //poll - always removes the head of the queue
        System.out.println("Poll: " + minHeap.poll());
        //peek after poll
        System.out.println("Peek after poll: " + minHeap.peek());
        //element - returns the head of the queue without removing it
        System.out.println("Element: " + minHeap.element());
        //isEmpty
        System.out.println("Empty: " + minHeap.isEmpty());
        //remove
        System.out.println("Remove 2 from minHeap: " + minHeap.remove(2));
        //size after remove
        System.out.println("Size after remove: " + minHeap.size());

        //clear
        minHeap.clear();
        System.out.println("Size after clear: " + minHeap.size());

        //parent is at (i - 1) / 2
        //left child is at 2 * i + 1
        //right child is at 2 * i + 2
        //equal values are not required to be adjacent—only the parent-child relationship 
        //parent <= child in a min-heap, parent >= child in a max-heap is maintained

    }
}

class MaxComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b.compareTo(a); 
    }
}

/*
output:
Min-Heap: [1, 2, 8, 5, 2]
Max-Heap: 8 2 5 1 2 
Max-Heap in sorted order: 8 5 2 2 1 
Size: 0
Peek: 1
Poll: 1
Peek after poll: 2
Element: 2
Empty: false
Remove 2 from minHeap: true
Size after remove: 3
Size after clear: 0
 */