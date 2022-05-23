package CollectionsAnujBhaiya;

//Manipulation on arrays

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //To do a binary search, we can use the methods provided by Arrays class which is .binarySearch(arrayName, elementToFind);
        // Note: the binarySearch will only work when the array is sorted.
        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("The index at which element 4 is present is: " + index);

        int[] unsortedNumbers = {10, 12, 4, 7, 1, 34, 6, 19, 9, 8};
        // To sort an array, we use Arrays.sort()
        Arrays.sort(unsortedNumbers); // quick sort behind the scenes

        for(int i : unsortedNumbers){
            System.out.println("i " + i);
        }


    }

}
