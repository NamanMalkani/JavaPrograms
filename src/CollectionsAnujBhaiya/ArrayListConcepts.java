package CollectionsAnujBhaiya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcepts {
    public static void main(String[] args) {

        //Internally ArrayList uses array for storing elements
        ArrayList<String> studentsName = new ArrayList<>();  //This statement creates an empty array in the memory.

        // NOTE: We can also write List<Integer> list = new LinkedList<>();, the same methods of arrayList can be used for this syntax.

        studentsName.add("Naman"); //The first .add statement creates the array of size of 10 elements.
        studentsName.add("Kaustubhi");

        //After those 10 elements size gets filled by adding 10 elements to the ArrayList, the size of the ArrayList gets increased by logic,
        // Size = n + n/2 + 1; Example: size = 10, then increment would be = 10 + (10/2) + 1 = 16.
        //Now ArrayList will create a new ArrayList of 16 element size and copy the elements of old/ previous ArrayList in to the new size ArrayList.

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4); //New element gets added at the last when .add is used
        System.out.println(list);

        list.add(2,50); // To add element at a particular index

        System.out.println(list); // [1, 2, 50, 3, 4]

        List<Integer> newlist = new ArrayList<>();
        newlist.add(140);
        newlist.add(160);

        list.addAll(newlist); // will add elements of the newlist to the list
        System.out.println(list); // [1, 2, 50, 3, 4, 140, 160]

        //To get the element at a particular index Ex. list.get(index)
        System.out.println(list.get(0)); // 1
        System.out.println(list.get(1)); // 50

        list.set(0,100); // will set/update value at 0th index to 100
        System.out.println(list); // [100, 2, 50, 3, 4, 140, 160]

        // to check whether the element exists in the arraylist

        System.out.println(list.contains(50)); // will return a boolean value, if exists - true otherwise false

        // .size() with for loop
        for(int i = 0; i < list.size(); i++){
            System.out.println("The element is " + list.get(i));
        }

        //for each loop
        for(Integer element: list){
            System.out.println("For each element: " + element);
        }

        //Iterator - every collection has a iterator
        Iterator<Integer> it = list.iterator();  // returns an iterator (object) which has a functionalities inside it.

        // .hasNext() - it keep on running the loop until there are items in the list
        while(it.hasNext()){
            System.out.println("Iterator: " + it.next()); // .next() accesses and prints the iterator next value which is the element in this case
        }


        // To remove an element from the arraylist , Ex  list.remove(index)
//        list.remove(0); // will remove element at 0th index
//        System.out.println(list); // [2, 50, 3, 4, 140, 160]
//
//        // To remove a particular element from the arraylist
//        list.remove(Integer.valueOf(50));
//        System.out.println(list); // [2, 3, 4, 140, 160]
//
//        list.clear(); // will clear all the elements in the list AKA delete all the elements from the list
//        System.out.println(list); // []


    }


}
