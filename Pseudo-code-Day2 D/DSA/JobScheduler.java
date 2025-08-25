
// DSA - Moderate: Job Scheduler using Priority Queue
import java.util.*;

class Job implements Comparable<Job> {
    String name;
    int deadline, time;
    Job(String name, int deadline, int time) {
        this.name = name;
        this.deadline = deadline;
        this.time = time;
    }

    public int compareTo(Job other) {
        return this.deadline - other.deadline;
    }
}

public class JobScheduler {
    public static void main(String[] args) {
        PriorityQueue<Job> pq = new PriorityQueue<>();
        pq.add(new Job("Job1", 2, 4));
        pq.add(new Job("Job2", 1, 2));
        pq.add(new Job("Job3", 3, 1));

        while (!pq.isEmpty()) {
            Job job = pq.poll();
            System.out.println("Processing " + job.name + " with deadline " + job.deadline);
        }
    }
}
