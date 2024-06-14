/*
 *CS 2013
 *Lab 3 - Generics Pt 5
 *Benjamin Saucedo
 *public static <E extends Comparable<E>> void sort(E[] list)
 * implement a sort method that works with any type
 */

import java.util.Arrays;

public class Lab3_pt5 {

    public static void main(String[] args) {
        //driver code to test Comparable sort method
        //create arrays of different types
        Integer[] intArr = {2, 3, 4, 7, 9, 10, 40, 4, 10, 19, 23, 87, 6};
        String[] strArr = {"cat","dog","bat","rat","fog","nat","matt"};

        //sort and print results
        sort(strArr);
        System.out.println("Sort list of strings: " + Arrays.toString(strArr));

        //sort and print results
        sort(intArr);
        System.out.println("Sort list of ints: " + Arrays.toString(intArr));

    } // End of main()

    /*
    Take in an array of any type
    sort the array
    parameters: E[]
    returns: void but array will be sorted
    */
    public static <E extends Comparable<E>> void sort(E[] list){
        //used insertion sort from chptr 23 modified so it works with generics
        for (int i = 1; i < list.length; i++) {
            /** Insert list[i] into a sorted sublist list[0..i−1] so that
             list[0..i] is sorted. */
            E currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k].compareTo(currentElement) > 0; k--) {
                list[k + 1] = list[k];
            }
            // Insert the current element into list[k + 1]
            list[k + 1] = currentElement;
        }
    }//end sort()
} // end SortGeneric
