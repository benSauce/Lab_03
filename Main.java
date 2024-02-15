import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Get the ArrayList with duplicate values
        //ArrayList<Integer> list = new ArrayList<>( Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        ArrayList<String> list = new ArrayList<>( Arrays.asList("cat","dog","bat","rat","dog","bat","cat"));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + list);

        // Remove duplicates
        //ArrayList<Integer> newList = removeDuplicates(list);
        ArrayList<String> newList = removeDuplicates(list);


        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList);
    } // End of main()

    public static <E> ArrayList<E> removeDuplicates (ArrayList<E> list){
        // Create a new ArrayList
        ArrayList<E> newList = new ArrayList<E>();

        // Traverse through the first list
        for (E element : list) {
            // If this element is not present in newList then add it
            if (!newList.contains(element)) {
                newList.add(element);
            } //End if
        } //End for
        return newList;

    } //End of removeDuplicates()
} // End of Main