/*
*CS 2013
*Lab 3 - Generics Pt 1
*Benjamin Saucedo
*public static <E> ArrayList<E> removeDuplicates (ArrayList<E> list)
*   Implement this method so that it takes an array of any type
*   and removes any duplicates.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Lab3_Pt1 {

    public static void main(String[] args) {

        // Get the ArrayList with duplicate values
        ArrayList<Integer> list1 = new ArrayList<>( Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("Original ArrayList: " + list1);

        // Remove duplicates
        ArrayList<Integer> newList1 = removeDuplicates(list1);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList1);

        //Create a space between print statements
        System.out.println();

        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("cat","dog","bat","rat","dog","bat","cat"));

        // Print the Arraylist
        System.out.println("Original ArrayList: " + list2);

        // Remove duplicates
        ArrayList<String> newList2 = removeDuplicates(list2);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: " + newList2);


    } // End of main()

    /*
    Take in an array of any type
    Create new array list
    copy element from original array to new list
        if it is not already in new list.
    parameters: ArrayList<E>
    returns: ArrayList<E>
     */
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