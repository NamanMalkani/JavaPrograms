package CollectionsAnujBhaiya;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Accommodates data in key value pair

// Key and value can be of any type , example: Integer, String , Object etc.

// There are many advantages of using a Map, since it provides data to store in key value pairs, key being the unique element.
public class LearnMap {
    public static void main(String[] args) {
        //The order is not maintained in HashMap
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);

        // Key will always be unique
        //If we try to add some other value to the same key, it'll get overridden, i.e. the value will get replaced by the latest value
        // Basically the value gets updated.
        numbers.put("One",11);

        //If you want to check if the key is not present and then only update, we can use if condition with .containsKey()
        if(!numbers.containsKey("Two")){
            numbers.put("Two",22);
        }

        //the above logic with inbuily map function putIfAbsent, basically means add into the map if it doesn't exist
        numbers.putIfAbsent("Two",23);

        System.out.println(numbers);

        // How to iterate in a Map, the values put inside a map form an entry, Entry class and that's how elements are getting added.

        for(Map.Entry<String,Integer> e: numbers.entrySet()){
            // for printing only keys
            System.out.println(e);
            System.out.println(e.getKey());
            // for printing only values
            System.out.println(e.getValue());
        }

        // to print only keys
        for(String key: numbers.keySet()){
            System.out.println(key);
        }



        // to print only values
        for(Integer value: numbers.values()){
            System.out.println(value);
        }

        // To check if a value exists in the map or not, will return a boolean value
        System.out.println(numbers.containsValue(3));

        //To remove an element, takes the key to remove
        numbers.remove("Three");

        //To check if a map is empty or not
        System.out.println(numbers.isEmpty());

        //To clear, clear()

        //TREEMAP
        // // under the hood, the Treemap entries the data in a binary search tree, so the order will be now sorted on the basis of Keys
        Map<String, Integer> numbersTree = new TreeMap<>(); // log(n)

        numbersTree.put("One",1);
        numbersTree.put("Two",2);
        numbersTree.put("Three",3);
        numbersTree.put("Five",5);

        System.out.println(numbersTree);
    }

    public void printMsg(){
        System.out.println("Print this msg");
    }

    public void View(){
        printMsg();
    }
}

