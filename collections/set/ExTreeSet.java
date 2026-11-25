import java.util.Iterator;
import java.util.TreeSet;

public class ExTreeSet {

    public static void main(String[] args) {
        //non-indexed, unordered, sorted and duplicates are not allowed.
        //internally TreeSet uses BST (Binary Search Tree) and is backed by a TreeMap to store elements
        //elements are stored in a sorted order (ascending by default) and duplicates are not allowed
        //lookups/insertions are slower than HashSet
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        //Iterator to traverse the set
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        //remove element
        set.remove(1);
        System.out.println(set);

        //other methods
        //length
        System.out.println(set.size());
        //empty or not
        System.out.println(set.isEmpty());
        //find
        System.out.println(set.contains(5));
        //clear
        set.clear();
        System.out.println(set);
    }
}

/*
output:
1 2 3 4 5 
[2, 3, 4, 5]
4
false
true
[]
 */
