
public class LinearSearch {

    public static void main(String[] args) {

        //driver code to test linear search method
        //Integer arr[] = {2, 3, 4, 7, 9, 10, 40};
        //Integer x = 10;
        String[] arr = {"cat","dog","bat","rat","fog","nat","matt"};
        String x = "matt";

        //Call function
        int result = linearSearch(arr, x);
        if (result == -1){
            System.out.print( "Element is not present in Array.");
        } else {
            System.out.print("Element is present at index " + result);
        }
    } // End of main()

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