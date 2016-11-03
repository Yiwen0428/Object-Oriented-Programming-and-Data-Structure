package student;
import java.util.*;

/** An instance is a priority queue of elements of type E
 * implemented asa min-heap. */
public class Heap<E> implements PCue<E> {

    private int size; // number of elements in the priority queue (and heap)

    /** heap invariant for b[0..size-1]:
     *  b[0..size-1] is viewed as a min-heap, i.e.
     *  1. Each array element in b[0..size-1] contains a value of the heap.
     *  2. The children of each b[i] are b[2i+1] and b[2i+2].
     *  3. The parent of each b[i] is b[(i-1)/2].
     *  4. The priority of the parent of each b[i] is <= the priority of b[i].
     *  5. Priorities for the b[i] used for the comparison in point 4
     *     are given in map. map contains one entry for each element of
     *     the heap, and map and b have the same size.
     *     For each element e in the heap, the map entry contains in the
     *     EInfo object the priority of e and its index in b.
     */
    private ArrayList<E> b= new ArrayList<E>();
    private HashMap<E, EInfo> map= new HashMap<E, EInfo>();

    /** Constructor: an empty heap. */
    public Heap() {
    }

    /** Return a string that gives this priority queue, in the format:
     * [item0:priority0, item1:priority1, ..., item(N-1):priority(N-1)]
     * Thus, the list is delimited by '['  and ']' and ", " (i.e. a
     * comma and a space char) separate adjacent items. */
    public @Override String toString() {
        String s= "";
        for (E t : b) {
            if (s.length() > 0) {
                s = s + ", ";
            }
            s = s + t + ":" + map.get(t).priority;
        }
        return "[" + s + "]";
    }

    /** Return a string that gives the priorities in this priority queue,
     * in the format: [priority0, priority1, ..., priority(N-1)]
     * Thus, the list is delimited by '['  and ']' and ", " (i.e. a
     * comma and a space char) separate adjacent items. */
    public String toStringPriorities() {
        String s= "";
        for (E t : b) {
            if (s.length() > 1) {
                s = s + ", ";
            }
            s = s + map.get(t).priority;
        }
        return "[" + s + "]";
    }

    /** Return the number of elements in the priority queue.
     * This operation takes constant time. */
    public @Override int size() {
        return size;
    }

    /** Add e with priority p to the priority queue.
     *  Throw an illegalArgumentException if e is already in the queue.
     *  The expected time is O(log N) and the worst-case time is O(N). */ 
    public @Override void add(E e, double p) throws IllegalArgumentException {
        if (map.containsKey(e)) {
            throw new IllegalArgumentException("e is already in priority queue");
        }
        // TODO  First: Do add and bubbleUp.

    }

    /** Return the element of the priority queue with lowest priority, without
     *  changing the queue. This operation takes constant time.
     *  Precondition: the priority queue is not empty. */
    public E peek() {
        assert 0 < size;

        /// TODO  Second: Do peek.
        return null;
    }

    /** Remove and return the element of the priority queue with lowest priority.
     * The expected time is O(log n) and the worst-case time is O(N).
     *  Precondition: the priority queue is not empty. */
    public @Override E poll() {
        assert 0 < size;

        // TODO  THIRD: Do poll and bubbleDown.
       

        return null;
    }


    /** Change the priority of element e to p.
     *  The expected time is O(log N) and the worst-case is time O(N).
     *  Precondition: e is in the priority queue */
    public @Override void updatePriority(E e, double p) {
        // TODO  FOURTH: Do updatePriority.


    }


    /** Bubble b[k] up in heap to its right place.
     * Precondition: Every b[i] satisfies the heap property except perhaps
     *       k's priority < parent's priority */
    private void bubbleUp(int k) {

        // TODO  First: Do add and bubbleUp.

 

    }

    /** Bubble b[k] down in heap until it finds the right place.
     * Precondition: Every b[i] satisfies the heap property except perhaps
     * k's priority > a child's priority. */
    private void bubbleDown(int k) {
        // TODO  THIRD: Do poll and bubbleDown.
        
       
    }

    /** Return the index of the smaller child of b[q]
     * Precondition: left child exists: 2q+1 < size of heap */
    private int getSmallerChild(int q) {
        int lChild= 2*q + 1;
        if (lChild + 1  ==  size) return lChild;

        double lchildPriority= map.get(b.get(lChild)).priority;
        double rchildPriority= map.get(b.get(lChild+1)).priority;
        if (lchildPriority < rchildPriority)
            return lChild;
        return lChild+1;
    }

    /** An instance contains the index and priority of an element of the heap. */
    private static class EInfo {
        private int index;  // index of this element in map
        private double priority; // priority of this element

        /** Constructor: an instance in b[i] with priority p. */
        private EInfo(int i, double p) {
            index= i;
            priority= p;
        }
    }
}