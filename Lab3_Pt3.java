/*
 *CS 2013
 *Lab 3 - Generics Pt 3
 *Benjamin Saucedo
 *public static <E extends Comparable<E>> E max(E[] list)
 *   Find the maximum element in an array of any type
 */

public class Lab3_Pt3 {

    // Driver/Test code
    public static void main(String[] args) {
        //driver code to test Comparable max method
        //Integer[] arr = {2, 3, 4, 7, 9, 10, 40, 4, 10, 19, 23, 87, 6};
        String[] arr = {"cat","dog","bat","rat","fog","nat","matt"};

        //Call method and print result
        System.out.print("Maximum element is: " + max(arr));

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
    public static <E extends Comparable<E>> E max(E[] list){
        //Set initial value
        E maxVal = list[0];

        //parse through list
        for (int i = 0; i < list.length; i++){
            //check if maxVal is less than list[i]
            if (maxVal.compareTo(list[i]) < 0){
                //set new maxVal if -1
                maxVal = list[i];
            }
        }
        return maxVal;
    } // End max()

} //End MaxSearch
