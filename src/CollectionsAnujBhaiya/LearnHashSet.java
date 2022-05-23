package CollectionsAnujBhaiya;

// HashSet, LinkedHashSet and TreeSet all follow Set property which is there cannot be duplicate elements.

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {
    public static void main(String[] args) {

        // Big o(1)
        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set); // will be printed in random order in Hashset, and no duplicates values will be allowed.

        //The random occurs due to hashing.

        // To remove an element in the set, we use .remove(element) method
        set.remove(54);

        System.out.println(set);

        // To check if the set contains an element or not, we use the contains() method, it returns either true or false.
        System.out.println(set.contains(100)); // false
        System.out.println(set.contains(21)); // true

        // to check if the set is empty or not at that instance of time, will return a boolean value
        // If the set is empty, it'll return true otherwise it'll return false
        System.out.println(set.isEmpty()); // false

        // To know the size of the set, we use the function .size()
        System.out.println(set.size()); // 4

        // To clear/ empty the set , we use .clear() method
        System.out.println(set.size());

        // To use LinkedHashSet , we will just write the following syntax:

        // Set<Integer> set = new LinkedHashSet<>();

        //Same methods as above can be used for LinkedHashSet.
        //But here for LinkedHashSet the properties changes now. So the LinkedHashSet will implement the properties of a Set but also a LinkedList.
        // Therefore, the elements are inserted one after another, therefore the order is maintained in a LinkedHashSet. * Important interview Question: which set maintains order of element.

        //TREESET : so TreeSet also has the properties of a set, but behind the scenes, it is doing in sorted form.(Binary search tree implementation)
        // So there are no duplicate elements and all the elements are sorted.
        //INTERVIEW QUESTION: Which collection to use when we want unique elements and in a sorted manner? Answer: TreeSet

        // O(log n)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(32);
        treeSet.add(2);
        treeSet.add(54);
        treeSet.add(21);
        treeSet.add(65);

        System.out.println(treeSet); // [2, 21, 32, 54, 65 ]

        // So a situation can arise where we don't want to make the set of a primitive datatype( wrapper class), and we
        // want to make a set of custom class. Naturally we cannot do that.

        // Suppose there is a class Student( refer to Student class), and we want every student to have a unique roll number, so we can use Set there.

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Jatin", 2));
        studentSet.add(new Student("Harsh", 3));
        studentSet.add(new Student("Kiran", 4));

        // So if I add this student with the same name and roll number which is already there, it'll add into the set, it will see it as a unique element.
        studentSet.add(new Student("Jatin", 2)); //Note: After implementing HashCode and equals method, this will not work and will not be added in the Set.

        System.out.println("Student Set: ");
        System.out.println(studentSet); //

        //Before implementing Hashcode and equals
        // Since I am making an object of the student by using the new keyword (Ex. studentSet.add(new Student("Jatin", 2))), so set is identifying it as two different objects. Therefore, it is inserting into the set
        // Behind the scenes, the HashSet uses an equal method to check if the element is duplicate or not. But in this case, we will have to make the equals method ourselves.
        //To check the two student objects if they are equal on the basis of roll number, we can use the equals() method.

        Student s1 = new Student("Adarsh",31);
        Student s2 = new Student("Saharsh",31);

        System.out.println(s1.equals(s2)); // will return true as both objects have same roll number

    }

}
