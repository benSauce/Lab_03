/*
 *CS 2013
 *Lab 3 - Generics Pt 2
 *Benjamin Saucedo
 *public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 *   Implement this method so that it takes an array of any type
 *   and removes any duplicates.
 */
public class Lab3_Pt2 {

    public static void main(String[] args) {

        //driver code to test linear search method
        //Integer arr[] = {2, 3, 4, 7, 9, 10, 40};
        //Integer x = 10;
        String[] arr = {"cat","dog","bat","rat","fog","nat","matt"};
        String x = "fog";

        //Call function
        int result = linearSearch(arr, x);
        if (result == -1){
            System.out.print( "Element is not present in Array.");
        } else {
            System.out.print("Element is present at index " + result);
        }
    } // End of main()

    /*
    Take in an array of any type and a key of same type
    loop through array
    check if array element matches key
    if key is found, return index
    else return -1
    parameters: E[] and E key
    returns: int
     */
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        //for loop to to parse through array
        for (int i = 0; i < list.length; i++){
            //check to see if data at index matches key
            if (list[i] == key)
                //return index of match
                return i;
        }
        //else return -1
        return -1;
    } //End of linearSearch()
} // End of Main