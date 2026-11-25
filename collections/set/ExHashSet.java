import java.util.HashSet;
import java.util.Iterator;

public class ExHashSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //non-indexed, unordered, unsorted and duplicates are not allowed.
        //internally HashSet is backed by a HashMap to store elements.
        //elements are hashed to find a bucket if a bucket is empty, the element is placed there,
        //and if a collision occurs, entries are chained/linked in that bucket.
        //duplicates are not allowed, elements are not stored in any guaranteed order 
        //and lookups/insertions are fast.
        //the internal capacity is not fixed and grows automatically when needed,
        //though it does not automatically shrink when elements are removed.
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
