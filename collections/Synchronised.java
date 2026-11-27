import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Synchronised {

    public static void main(String[] args) {
        //wrap normal collections so single method calls are thread-safe
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        Set<String> syncSet = Collections.synchronizedSet(new HashSet<>());
        Map<String, Integer> syncMap = Collections.synchronizedMap(new HashMap<>());

        //initial items before spinning up worker threads
        syncList.add("Hello");
        syncList.add("World");
        syncSet.add("XYZ");
        syncSet.add("ABC");
        syncMap.put("Key1", 1);
        syncMap.put("Key2", 2);

        //synchronized wrappers only lock individual calls, not a full loop.
        //always lock on the collection while iterating to avoid ConcurrentModificationException.
        synchronized (syncList) {
            for (int i = 0; i < 5; i++) {
                syncList.add("Item " + i);
            }
        }
        synchronized (syncSet) {
            for (int i = 0; i < 5; i++) {
                syncSet.add("Item " + i);
            }
        }
        synchronized (syncMap) {
            for (int i = 0; i < 5; i++) {
                syncMap.put("Key" + (i + 3), i + 3);
            }
        }

        //similarly while printing
        synchronized (syncList) {
            for (String item : syncList) {
                System.out.println(item);
            }
        }

        synchronized (syncSet) {
            for (String item : syncSet) {
                System.out.println(item);
            }
        }

        synchronized (syncMap) {
            for (Map.Entry<String, Integer> entry : syncMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
