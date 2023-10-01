import java.util.*;

public class PQ2_PriorityQueues_InClasses {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String NAME, int RANK) {
            this.name = NAME;
            this.rank = RANK;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Yash", 45271)); // O(Logn).....
        pq.add(new Student("Isha", 170993)); // O(Logn).....
        pq.add(new Student("Abhishek", 10763)); // O(Logn).....
        pq.add(new Student("Himanshu", 22364)); // O(Logn).....
        pq.add(new Student("Abdul", 212364)); // O(Logn).....
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " --> " + pq.peek().rank);
            pq.remove();
        }
    }
}
