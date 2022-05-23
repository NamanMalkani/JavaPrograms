package CollectionsAnujBhaiya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Collection class is present at the top of collection framework, it gives us some inbuilt properties/ methods by which we
// can perform operations like finding a minimum value element, maximum value element, frequency (how many times an element is occuring), etc.

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(12);
        list.add(9);
        list.add(9);
        list.add(29);
        list.add(75);

        // To find the minimum value element in arraylist
        System.out.println("Minimum value element is ArrayList: " + Collections.min(list));

        // To find the maximum value element in arraylist
        System.out.println("Maximum value element is ArrayList: " + Collections.max(list));

        // To find the frequency of an element in arraylist
        System.out.println("Minimum value element is ArrayList: " + Collections.frequency(list, 9));

        // To sort
        Collections.sort(list);

        System.out.println("Ascending order: " + list);

        // To sort in reverse order
        Collections.sort(list, Comparator.reverseOrder());

        System.out.println("Descending order: " + list);

        // Sorting custom classes
        // We will use the student class as we made earlier
        // We can sort on the basis of roll number and name

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Anuj", 22));
        studentList.add(new Student("Mohit", 18));
        studentList.add(new Student("Rekha", 45));
        studentList.add(new Student("Jatin", 1));

        // Collections.sort(studentList); // This will not work, since the Collection class doesn't know on what basis to sort

        // To make it understand, we will have to implement an interface of Comparable in student class

        Student s1 = new Student("Adarsh",31);
        Student s2 = new Student("Saharsh",30);

        System.out.println(s1.compareTo(s2)); // This will return an integer. either positive, negative or zero, the comparison is on the basis of Roll number

        // after implementing the Comparable interface, the Collections.sort method will work
        Collections.sort(studentList);

        System.out.println(studentList);

        // Now if you want to sort on the basis of name(String)
        // we use Comparator
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        //using lambda

        Collections.sort(studentList, (o1, o2) -> o1.name.compareTo(o2.name));



    }
}
