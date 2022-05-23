package CollectionsAnujBhaiya;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        //Here as the datatype/ wrapper class is Integer, so the smaller integer value will get the top priority by default. It can be changed.

        //same functions as queue can be used, example offer(), poll(), etc. Refer to LearnLinkedListQueue.

        priorityQueue.offer(98);
        priorityQueue.offer(17);
        priorityQueue.offer(45);

        System.out.println(priorityQueue); //  [17, 98, 45] Order is like this because MinHeap is being implemented here. In MinHeap , the smallest element is at the top.

        // When we use poll() with a PriorityQueue, then the element with the highest priority( i.e the lowest value) will be taken out/ removed.

        priorityQueue.poll();

        System.out.println(priorityQueue); // [45, 98] - Again MinHeap so 45

        // peek
        System.out.println(priorityQueue.peek());

        // So if we want to take out the highest value number, so we will have to pass a comparator in the constructor of PriorityQueue.
        // Example: PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); // Will convert from MinHeap to MaxHeap
        // This will reverse the priority, now instead of the lowest value, it'll pick the highest value.



    }
}
