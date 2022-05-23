package CollectionsAnujBhaiya;

import java.util.ArrayDeque;

//Doubly ended queue - Can insert elements from front and back, either sides
public class LearnArrayDeque {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        //same functions as queue, example offer(), poll() etc
        adq.offer(40);

        //ArrayDeque unique functions

        // offerFirst enters element at the first, normally in queue when we enter the element, it is added at the last.
        adq.offerFirst(23);

        // offerFirst enters element at the last.
        adq.offerLast(67);

        adq.offer(34);
        System.out.println(adq); // [23, 40, 67, 34]

        System.out.println(adq.peek()); // 23 , will look at the starting element of the ArrayDeque
        System.out.println(adq.peekFirst()); //23 , will look at the starting element of the ArrayDeque
        System.out.println(adq.peekLast()); // 34 , will look at the last element of the ArrayDeque

        System.out.println(adq.poll()); // 23,  will remove the first element and return the first element from the ArrayDeque
        System.out.println("After Poll: " + adq); // After Poll: [40, 67, 34]

        System.out.println(adq.pollFirst()); // 40, will remove the first element and return the first element from the ArrayDeque
        System.out.println("After PollFirst: " + adq); // After PollFirst: [67, 34]

        System.out.println(adq.pollLast()); // 34,  will remove the last element and return the last element from the ArrayDeque
        System.out.println("After PollLast: " + adq); // [67]

    }
}

