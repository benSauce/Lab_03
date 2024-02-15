public class BinarySearch {

    // Driver/Test code
    public static void main(String[] args) {
        //driver code to test Comparable max method
        Integer[] arr = {2, 3, 4, 7, 9, 10, 40, 4, 10, 19, 23, 87, 6};
        //String[] arr = {"cat","dog","bat","rat","fog","nat","matt"};
        //String[] arr = {"Caryn", "Debbie", "Dustin", "Elliot", "Jacquie", "Jonathan", "Rich"};

        //Call method and print result
        int myElement = binarySearch(arr, 40);
        if (myElement == -1){
            System.out.print("Element not found in array.");
        } else {
            System.out.print(arr[myElement] + " was found at index: " + myElement);
        }

    } // End of main()
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key, int startPt, int endPt) {
        //check length of array
        if (startPt > endPt) {
            return -1;
        } else {
            //Set Middle Point of Array
            int midPt = (startPt + endPt)/2;
            //Check if key matches mid point
            int midChk = key.compareTo(list[midPt]);
            if (midChk == 0){
                return midPt;
            } else if ( midChk < 0) {
                return binarySearch(list, key,startPt, midPt -1);
            } else {
                return binarySearch(list, key, midPt + 1, endPt);
            }
        }
    } // end binarySearch()

    //binarySearch() recursive call
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        return binarySearch(list, key, 0, list.length - 1);

    }
} // end BinarySearch Class
