/*
 *CS 2013
 *Lab 3 - Generics Pt 6
 *Benjamin Saucedo
 *public static <E extends Comparable<E>> E max(ArrayList<E> list)
 *   Find the maximum element in an array of any type
 */

import java.util.ArrayList;

public class Lab3_pt6 {
    // Driver/Test code
    public static void main(String[] args) {
        //driver code to test Comparable max method
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(7);
        intList.add(12);
        intList.add(65);
        intList.add(22);
        intList.add(16);

        //Call method and print result
        System.out.print("Maximum element is: " + max(intList));

    } // End of main()

    /*
        Take in an array of any type
        set first element as max
        loop through array
        compare each element to max
        if current element is greater than max set current element as max
        parameters: E[]
        returns: E max
         */
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        //Set initial value
        E maxVal = list.get(0);

        //parse through list
        for (int i = 0; i < list.size(); i++){
            //check if maxVal is less than list[i]
            if (maxVal.compareTo(list.get(i)) < 0){
                //set new maxVal if -1
                maxVal = list.get(i);
            }
        }
        return maxVal;
    } // End max()

} //End MaxSearch
