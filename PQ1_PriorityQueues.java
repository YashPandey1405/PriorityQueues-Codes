import java.util.*;

public class PQ1_PriorityQueues {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // This Will Print PQ In Reverse Order....
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // Same As (PriorityQueue<Integer> pq = new PriorityQueue<>())...
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.naturalOrder());
        int arr[] = { 8, 6, 3, 5, 4, 2, 1, 7 };
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]); // O(Logn).......
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // O(1).......
            pq.remove(); // O(Logn).......
        }
    }
}
