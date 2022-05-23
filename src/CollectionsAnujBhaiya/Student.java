package CollectionsAnujBhaiya;

// For seeing Set implementation of custom class : LearnHashSet

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    int rollno;

    public Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    // Object class contains the toString(), hashCode() and equals() method.

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    //Hashcode and equals are based on Roll number

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }

    @Override
    public int compareTo(Student that) {
        return this.rollno - that.rollno;
    }
}
