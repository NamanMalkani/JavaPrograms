package CollectionsAnujBhaiya;

import java.util.Stack;

public class StackConcepts {
    public static void main(String[] args) {
        //Stack - LIFO - the element inserted at last will be at the top/start.
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Giraffe");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Animals: " + animals); // [Lion, Giraffe, Horse, Cat]

        // To check what is the element on the top of the stack we use .peek()
        System.out.println(animals.peek()); //Cat

        // Will remove the element on top of the stack (will remove the last element
        animals.pop(); // will remove cat

        System.out.println(animals.peek()); //Horse


    }


}
