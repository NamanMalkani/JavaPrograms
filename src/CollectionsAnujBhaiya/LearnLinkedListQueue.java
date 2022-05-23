package CollectionsAnujBhaiya;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //Methods of queue

        // offer helps us to add elements inside a queue
        queue.offer(12);
        queue.offer(34);
        queue.offer(36);
        queue.offer(90);

        System.out.println(queue); // [12, 34, 36, 90] , Since we added 12 first, the '12' is at the starting/top.

        // To remove/ takeout elements from a queue we use poll(), poll() removes the element at the top/starting of the queue and returns the element, so we have an option to print the element too
        System.out.println(queue.poll());

        System.out.println(queue); // [34, 36, 90]

        // To check which element is ready to be taken out or removed (i.e. at the starting), we use peek()

        System.out.println(queue.peek());

    }

}
